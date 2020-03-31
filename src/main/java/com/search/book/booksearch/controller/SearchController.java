package com.search.book.booksearch.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.search.book.booksearch.model.ApiResponse;
import com.search.book.booksearch.model.Item;
import com.search.book.booksearch.model.Library;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private RestTemplate restTemplate;

// add service layer for all the business logic
	// add the wrapper of response to all he methods for consistent response
	@GetMapping
	public ApiResponse<List<Item>> listBooks() {

		Library library = restTemplate.getForObject("https://www.googleapis.com/books/v1/volumes?q=search+terms.",
				Library.class);

		return new ApiResponse<>(HttpStatus.OK.value(), "List of books fetched successfully.", library.getItems());
	}

	@GetMapping("/{id}")
	public Item getBookDetailsById(@PathVariable int id) {

		return restTemplate.getForObject("https://www.googleapis.com/books/v1/volumes?q=search+terms.", Library.class)
				.getItems().get(id);
	}

	@GetMapping("/title/{title}")
	public ApiResponse<List<Item>> getBookDetailsByTitle(@PathVariable String title) {
		if(title==null)return null;
		return new ApiResponse<>(HttpStatus.OK.value(), "List of books fetched successfully with title. " + title,
				restTemplate.getForObject("https://www.googleapis.com/books/v1/volumes?q=search+terms.", Library.class)
						.getItems().stream().filter(item -> item.getVolumeInfo().getTitle().toLowerCase().contains(title.toLowerCase()))
						.collect(Collectors.toList()));

	}

	@GetMapping("/author/{authors}")
	public List<Item> getBookDetailsByAuthor(@PathVariable String authors) {

		return restTemplate.getForObject("https://www.googleapis.com/books/v1/volumes?q=search+terms.", Library.class)
				.getItems().stream().filter(item -> item.getVolumeInfo().getAuthors().contains(authors))
				.collect(Collectors.toList());

	}

}

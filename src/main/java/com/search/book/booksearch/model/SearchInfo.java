
package com.search.book.booksearch.model;

import java.util.HashMap;
import java.util.Map;

public class SearchInfo {

    private String textSnippet;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getTextSnippet() {
        return textSnippet;
    }

    public void setTextSnippet(String textSnippet) {
        this.textSnippet = textSnippet;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

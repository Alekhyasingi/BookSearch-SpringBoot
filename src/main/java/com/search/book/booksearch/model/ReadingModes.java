
package com.search.book.booksearch.model;

import java.util.HashMap;
import java.util.Map;

public class ReadingModes {

    private Boolean text;
    private Boolean image;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getText() {
        return text;
    }

    public void setText(Boolean text) {
        this.text = text;
    }

    public Boolean getImage() {
        return image;
    }

    public void setImage(Boolean image) {
        this.image = image;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

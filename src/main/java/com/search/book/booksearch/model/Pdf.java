
package com.search.book.booksearch.model;

import java.util.HashMap;
import java.util.Map;

public class Pdf {

    private Boolean isAvailable;
    private String acsTokenLink;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getAcsTokenLink() {
        return acsTokenLink;
    }

    public void setAcsTokenLink(String acsTokenLink) {
        this.acsTokenLink = acsTokenLink;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

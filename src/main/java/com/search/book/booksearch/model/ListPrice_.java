
package com.search.book.booksearch.model;

import java.util.HashMap;
import java.util.Map;

public class ListPrice_ {

    private Float amountInMicros;
    private String currencyCode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Float getAmountInMicros() {
        return amountInMicros;
    }

    public void setAmountInMicros(Float amountInMicros) {
        this.amountInMicros = amountInMicros;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

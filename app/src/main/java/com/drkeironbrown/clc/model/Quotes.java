package com.drkeironbrown.clc.model;

import java.io.Serializable;

public class Quotes implements Serializable {
    private String Quotes;

    public String getQuotes() {
        return Quotes;
    }

    public void setQuotes(String quotes) {
        Quotes = quotes;
    }

    public Quotes(String quotes) {
        Quotes = quotes;
    }

    public Quotes() {
    }
}

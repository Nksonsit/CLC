package com.drkeironbrown.clc.model;

import java.io.Serializable;
import java.util.List;

public class SpecificItem implements Serializable {
    private String Topic;
    private List<Quotes> Quotes;

    public String getTopic() {
        return Topic;
    }

    public void setTopic(String topic) {
        Topic = topic;
    }

    public List<com.drkeironbrown.clc.model.Quotes> getQuotes() {
        return Quotes;
    }

    public void setQuotes(List<com.drkeironbrown.clc.model.Quotes> quotes) {
        Quotes = quotes;
    }
}

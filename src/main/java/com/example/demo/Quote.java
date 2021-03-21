package com.example.demo;

public class Quote {

    private long id;
    private final String content;

    public Quote(long l, String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }


}

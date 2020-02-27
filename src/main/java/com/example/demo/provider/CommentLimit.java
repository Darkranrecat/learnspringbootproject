package com.example.demo.provider;

public class CommentLimit {
    static public String limitDescription(String description) {
        String limit;
        if(description.length() > 50)
            limit = description.substring(0, 50)+"...";
        else limit = description;
        return limit;
    }
}

package com.main.utility;

import org.springframework.stereotype.Component;

@Component
public class Message {
    private String userID;
    private String message;

    public Message(String userID, String message) {
        this.userID = userID;
        this.message = message;
    }

    public String getUserID() {
        return userID;
    }

    public String getMessage() {
        return message;
    }
}

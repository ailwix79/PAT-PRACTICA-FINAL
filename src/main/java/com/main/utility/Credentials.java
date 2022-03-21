package com.main.utility;

import org.springframework.stereotype.Component;

@Component
public class Credentials {
    private String username;
    private String passwd;

    public Credentials(String username, String passwd) {
        this.username = username;
        this.passwd = passwd;
    }

    public String getUserName() {
        return username;
    }
    
    public String getPaswd() {
        return passwd;
    }
}

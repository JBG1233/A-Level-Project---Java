package com.questionnaire.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    public String username;
    public String password;
    public String access_token;

    public User(String username, String password, String access_token) {
        this.username = username;
        this.password = password;
        this.access_token = access_token;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccess_token() {
        this.access_token = access_token;
    }


}

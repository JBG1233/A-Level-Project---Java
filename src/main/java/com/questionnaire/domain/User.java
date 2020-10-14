package com.questionnaire.domain;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
@NoArgsConstructor
@ToString
@Document(collection = "users")
public class User {

    public String username;
    public String password;
    public String accessToken;

    public User(String username, String password, String accessToken) {
        this.username = username;
        this.password = password;
        this.accessToken = accessToken;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }


}

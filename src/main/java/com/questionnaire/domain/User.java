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
    public long time;

    public User(String username, String password, String accessToken, long time) {
        this.username = username;
        this.password = password;
        this.accessToken = accessToken;
        this.time = time;
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

    public long getTime() {
        return time;
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

    public void setTime(long time) {
        this.time = time;
    }

}

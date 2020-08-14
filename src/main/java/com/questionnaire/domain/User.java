package com.questionnaire.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    public ObjectId _id;
    public String userUsername;
    public String userPassword;

    public User() {}

    public User(ObjectId _id, String userUsername, String userPassword) {
        this._id = _id;
        this.userUsername = userUsername;
        this.userPassword = userPassword;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


}

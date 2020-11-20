package com.questionnaire.domain;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@ToString
@Document(collection = "contact")
public class Contact {

    public String firstName;
    public String lastName;
    public String message;

    public Contact(String message, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}

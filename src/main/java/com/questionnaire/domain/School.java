package com.questionnaire.domain;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@ToString
@NoArgsConstructor
@Document(collection = "schools")
public class School {

    public String schoolID;
    public String name;

    public void Score(String schoolID, String name) {
        this.schoolID = schoolID;
        this.name = name;
    }

    public String getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(String schoolID) {
        this.schoolID = schoolID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

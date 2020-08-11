package com.questionnaire.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "questions")
public class Question {

    @Id
    public ObjectId _id;

    String questionText;
    Integer questionNumber;

    public Question() {}

    public Question(ObjectId _id, String questionText, Integer questionNumber) {
        this._id = _id;
        this.questionText = questionText;
        this.questionNumber = questionNumber;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Integer getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setQuestionNumber(Integer questionNumber) {
        this.questionNumber = questionNumber;
    }

}

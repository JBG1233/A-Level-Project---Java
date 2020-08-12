package com.questionnaire.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "questions")
public class Question {

    @Id
    public ObjectId _id;
    public Double randNum;
    public String questionCode;
    public String questionText;
    public Integer questionNumber;

    public Question() {}

    public Question(ObjectId _id, Double randNum, String questionCode, String questionText, Integer questionNumber) {
        this._id = _id;
        this.randNum = randNum;
        this.questionCode = questionCode;
        this.questionText = questionText;
        this.questionNumber = questionNumber;
    }

    public Double getRandNum() {
        return randNum;
    }

    public String getQuestionCode() {
        return questionCode;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Integer getQuestionNumber() {
        return questionNumber;
    }

    public void setRandNum(Double randNum) {
        this.randNum = (Math.random() * ( 20 - 1 )) + 1;
    }

    public void setQuestionCode(String questionCode) {
        this.questionCode = questionCode;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setQuestionNumber(Integer questionNumber) {
        this.questionNumber = questionNumber;
    }

}

package com.questionnaire.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "questions")
public class Question {

    @Id
    public ObjectId _id;
    public String questionCode;
    public String questionText;
    public Integer questionNumber;
    public String questionAnswer;

    public Question(ObjectId _id, String questionCode, String questionText, Integer questionNumber, String questionAnswer) {
        this._id = _id;
        this.questionCode = questionCode;
        this.questionText = questionText;
        this.questionNumber = questionNumber;
        this.questionAnswer = questionAnswer;
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

    public String getQuestionAnswer() {
        return questionAnswer;
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

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

}

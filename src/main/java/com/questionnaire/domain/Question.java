package com.questionnaire.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@NoArgsConstructor
@Data
@Document(collection = "questions")
public class Question {

    @Id
    public ObjectId _id;
    public String questionCode;
    public String questionText;
    public Integer questionNumber;
    public String questionAnswer;
    public String userQuestionAnswer;

    public Question(ObjectId _id, String questionCode, String questionText, Integer questionNumber, String questionAnswer, String userQuestionAnswer) {
        this._id = _id;
        this.questionCode = questionCode;
        this.questionText = questionText;
        this.questionNumber = questionNumber;
        this.questionAnswer = questionAnswer;
        this.userQuestionAnswer = userQuestionAnswer;
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

    public String getUserQuestionAnswer(){return userQuestionAnswer;}

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

    public void setUserQuestionAnswer(String userQuestionAnswer){this.userQuestionAnswer = userQuestionAnswer;}

}

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
    public String quizId;
    public String questionText;
    public Integer questionId;
    public String questionAnswer;
    public String userQuestionAnswer;

    public Question(ObjectId _id, String quizId, String questionText, Integer questionId, String questionAnswer, String userQuestionAnswer) {
        this._id = _id;
        this.quizId = quizId;
        this.questionText = questionText;
        this.questionId = questionId;
        this.questionAnswer = questionAnswer;
        this.userQuestionAnswer = userQuestionAnswer;
    }

    public String getQuizId() {
        return quizId;
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getUserQuestionAnswer(){
        return userQuestionAnswer;
    }

    public void setUserQuestionAnswer(String userQuestionAnswer){
        this.userQuestionAnswer = userQuestionAnswer;
    }

}

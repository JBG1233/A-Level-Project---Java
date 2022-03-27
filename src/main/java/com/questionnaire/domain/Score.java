package com.questionnaire.domain;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@ToString
@NoArgsConstructor
@Document(collection = "score")
public class Score {

    public Integer answeredWrong;
    public Integer answeredRight;
    public Integer answered;
    public Integer quizzesTaken;
    public String userId;
    public ArrayList qWrongLast7;
    public ArrayList qRightLast7;
    public ArrayList percentageLast7;

    public Score(Integer answeredWrong, Integer answeredRight, Integer answered, Integer quizzesTaken, String userId, ArrayList qWrongLast7, ArrayList qRightLast7, ArrayList percentageLast7) {
        this.answeredWrong = answeredWrong;
        this.answeredRight = answeredRight;
        this.answered = answered;
        this.quizzesTaken = quizzesTaken;
        this.userId = userId;
        this.qWrongLast7 = qWrongLast7;
        this.qRightLast7 = qRightLast7;
        this.percentageLast7 = percentageLast7;
    }

    public Integer getAnsweredWrong() {
        return answeredWrong;
    }

    public void setAnsweredWrong(Integer answeredWrong) {
        this.answeredWrong = answeredWrong;
    }

    public Integer getAnsweredRight() {
        return answeredRight;
    }

    public void setAnsweredRight(Integer answeredRight) {
        this.answeredRight = answeredRight;
    }

    public Integer getAnswered() {
        return answered;
    }

    public void setAnswered(Integer answered) {
        this.answered = answered;
    }

    public Integer getQuizzesTaken() {
        return quizzesTaken;
    }

    public void setQuizzesTaken(Integer quizzesTaken) {
        this.quizzesTaken = quizzesTaken;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ArrayList getQWrongLast7() {
        return qWrongLast7;
    }

    public void setQWrongLast7(ArrayList qWrongLast7) {
        this.qWrongLast7 = qWrongLast7;
    }

    public ArrayList getQRightLast7() {
        return qRightLast7;
    }

    public void setQRightLast7(ArrayList qRightLast7) {
        this.qRightLast7 = qRightLast7;
    }

    public ArrayList getPercentageLast7() {
        return percentageLast7;
    }

    public void setPercentageLast7(ArrayList percentageLast7) {
        this.percentageLast7 = percentageLast7;
    }

}

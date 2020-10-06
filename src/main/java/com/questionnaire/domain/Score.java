package com.questionnaire.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "score")
public class Score {

    public Integer answeredWrong;
    public Integer answeredRight;
    public Integer answered;
    public Integer quizzesTaken;
    public String accessToken;

    public Score(Integer answeredWrong, Integer answeredRight, Integer answered, Integer quizzesTaken, String accessToken) {
        this.answeredWrong = answeredWrong;
        this.answeredRight = answeredRight;
        this.answered = answered;
        this.quizzesTaken = quizzesTaken;
        this.accessToken = accessToken;
    }

    public void setAnsweredWrong(Integer answeredWrong) {
        this.answeredWrong = answeredWrong;
    }

    public void setAnsweredRight(Integer answeredRight) {
        this.answeredRight = answeredRight;
    }

    public void setAnswered(Integer answered) {
        this.answered = answered;
    }

    public void setQuizzesTaken(Integer quizzesTaken) {
        this.quizzesTaken = quizzesTaken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getAnsweredWrong() {
        return answeredWrong;
    }

    public Integer getAnsweredRight() {
        return answeredRight;
    }

    public Integer getAnswered() {
        return answered;
    }

    public Integer getQuizzesTaken() {
        return quizzesTaken;
    }

    public String getAccessToken() {
        return accessToken;
    }

}

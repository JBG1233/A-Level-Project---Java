package com.questionnaire.service.Questions;

import com.questionnaire.domain.Question;
import com.questionnaire.repositories.QuestionsRepository;
import com.questionnaire.repositories.ScoresRepository;
import com.questionnaire.service.Exceptions.BadRequestException;
import lombok.extern.slf4j.Slf4j;
import me.xdrop.fuzzywuzzy.FuzzySearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Slf4j
@Service
public class QuestionValidator {

    @Autowired
    private QuestionsRepository questionsRepository;

    ScoresRepository scoresRepository;

    public Integer validate(ArrayList<Question> question, Integer score) throws BadRequestException {
        for (int questionIndex = 0; questionIndex <= 6; questionIndex++) {
            String userQuestionAnswer = question.get(questionIndex).userQuestionAnswer;
            Integer questionNumber = question.get(questionIndex).questionId;
            String questionCode = question.get(questionIndex).quizId;
            String realAnswer = (questionsRepository.findByQuestionIdAndQuizId(questionNumber, questionCode)).get(0).questionAnswer;
            score = validateAnswers(userQuestionAnswer, realAnswer, score);
        }
        return score;
    }

    public boolean checkForIllegalChars(String toExamine) {
        Pattern pattern = Pattern.compile("[~#@*+%{}<>\\[\\]|\"\\_^=]");
        Matcher matcher = pattern.matcher(toExamine);
        return matcher.find();
    }

    private Integer validateAnswers(String questionAnswer, String realAnswer, Integer score) {
        return calculateScore(FuzzySearch.ratio(realAnswer, questionAnswer), score);
    }

    private Integer calculateScore(Integer validatedScore, Integer score) {
        if (validatedScore >= 70) {
            score = score + 1;
        }
        return score;   
    }
}

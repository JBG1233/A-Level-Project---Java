package com.questionnaire.service.Populate;

import com.questionnaire.domain.Question;
import com.questionnaire.domain.QuizGroup;
import com.questionnaire.repositories.QuestionsRepository;
import com.questionnaire.repositories.QuizGroupRepository;
import com.questionnaire.service.Generation.UserId;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class QuizCreation {

    @Autowired
    QuizGroupRepository quizGroupRepository;

    @Autowired
    QuestionsRepository questionsRepository;

    String groupId = UserId.getUserId(8);

    public void createGroup(QuizGroup quizGroup) {
        quizGroup.setQuizName(quizGroup.getQuizName());
        quizGroup.setQuizImage("favicon.ico");
        quizGroup.setQuizDescription(quizGroup.getQuizDescription());
        quizGroup.setGroupId(groupId);
        quizGroup.setSearchTerm(quizGroup.getSearchTerm());
        quizGroup.setAuthorName(quizGroup.getAuthorName());
        quizGroupRepository.save(quizGroup);
    }

    public void createQuestions(ArrayList<Question> question) {
        for (int questionIndex = 0; questionIndex <= 6; questionIndex++) {
            createQuestion(groupId, question.get(questionIndex).questionText, questionIndex, question.get(questionIndex).questionAnswer);
        }
    }

    public void createQuestion(String groupId, String questionText, Integer questionId, String questionAnswer) {
        Question question = new Question();
        question.setGroupId(groupId);
        question.setQuestionText(questionText);
        question.setQuestionId(questionId);
        question.setQuestionAnswer(questionAnswer);
        questionsRepository.save(question);
    }
}
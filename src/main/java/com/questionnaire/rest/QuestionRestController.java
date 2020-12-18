package com.questionnaire.rest;

import com.questionnaire.domain.Question;
import com.questionnaire.domain.QuizGroup;
import com.questionnaire.repositories.QuestionsRepository;
import com.questionnaire.service.Questions.LoadQuestions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Set;

@Slf4j
@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "*")


public class QuestionRestController {

    @Autowired
    LoadQuestions loadQuestions;

    @Autowired
    QuestionsRepository questionsRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/questions/main/{groupId}")
    public Set<Question> loadQuiz (@PathVariable ("groupId") String groupId) {
        return loadQuestions.getQuestions(groupId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/questions/search/{userInput}")
    public List<QuizGroup> loadSearchQuiz(@PathVariable("userInput") String userInput) {
        return loadQuestions.getSearchResults(userInput);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/questions/view/{groupId}")
    public List<QuizGroup> loadViewQuiz(@PathVariable("groupId") String groupId) {
        return loadQuestions.getViewResults(groupId);
    }
 }

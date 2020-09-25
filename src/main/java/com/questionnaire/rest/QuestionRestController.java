package com.questionnaire.rest;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import com.questionnaire.domain.Question;
import com.questionnaire.repositories.QuestionsRepository;
import com.questionnaire.service.QuestionValidator;
import com.questionnaire.service.RandomNumberGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Set;

@Slf4j
@RestController
@RequestMapping("/rest/questions")
@CrossOrigin(origins = "http://localhost:3000")


public class QuestionRestController {

    @Autowired
    private QuestionsRepository questionsRepository;

    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    @Autowired
    QuestionValidator questionValidator = new QuestionValidator();

    @RequestMapping(method = RequestMethod.GET, value = "/UK")
    public Set<Question> loadUKQuiz () {
        Set<Integer> randomNumbers = randomNumberGenerator.generate(19);
        return questionsRepository.findByQuestionNumberInAndQuestionCode(randomNumbers, "GBP");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/Canada")
    public Set<Question> loadCanadaQuiz () {
        Set<Integer> randomNumbers = randomNumberGenerator.generate(19);
        return questionsRepository.findByQuestionNumberInAndQuestionCode(randomNumbers, "CAD");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/Australia")
    public Set<Question> loadAustraliaQuiz () {
        Set<Integer> randomNumbers = randomNumberGenerator.generate(19);
        return questionsRepository.findByQuestionNumberInAndQuestionCode(randomNumbers, "AUS");
    }
    @RequestMapping(method = RequestMethod.GET, value = "/Brazil")
    public Set<Question> loadBrazilQuiz () {
        Set<Integer> randomNumbers = randomNumberGenerator.generate(19);
        return questionsRepository.findByQuestionNumberInAndQuestionCode(randomNumbers, "BRL");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/China")
    public Set<Question> loadChinaQuiz () {
        Set<Integer> randomNumbers = randomNumberGenerator.generate(19);
        return questionsRepository.findByQuestionNumberInAndQuestionCode(randomNumbers, "CNY");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/Validation")
        public Integer checkIfAnswersAreValid(@RequestBody Question question) {
        return questionValidator.validate(question.getUserQuestionAnswer(), question.getQuestionNumber(), question.getQuestionCode());
    }

}

package com.questionnaire.rest;

import com.questionnaire.domain.Question;
import com.questionnaire.repositories.QuestionsRepository;
import com.questionnaire.service.RandomNumberGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Slf4j
@RestController
@RequestMapping("/rest/questions")
@CrossOrigin(origins = "*")


public class QuestionRestController {

    @Autowired
    private QuestionsRepository questionsRepository;

    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    @RequestMapping(method = RequestMethod.GET, value = "/{groupId}")
    public Set<Question> loadQuiz (@PathVariable ("groupId") String groupId ) {
        Set<Question> groupIds = questionsRepository.findByGroupIdIn(groupId);
        List<Question> groupIdList = new ArrayList<>(groupIds);
        Integer startRange = (groupIdList.get(0)).questionId;
        Integer endRange = (groupIdList.get(19)).questionId;
        Set<Integer> randomNumbers = randomNumberGenerator.generate(startRange, endRange);
        return questionsRepository.findByQuestionIdInAndGroupId(randomNumbers, groupId);
    }

}

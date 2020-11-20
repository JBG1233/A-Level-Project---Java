package com.questionnaire.service;

import com.questionnaire.domain.Question;
import com.questionnaire.domain.QuizGroup;
import com.questionnaire.repositories.QuestionsRepository;
import com.questionnaire.repositories.QuizGroupRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import me.xdrop.fuzzywuzzy.FuzzySearch;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Slf4j
@Service
public class LoadQuestions {

    @Autowired
    public QuestionsRepository questionsRepository;

    @Autowired
    public QuizGroupRepository quizGroupRepository;

    @Autowired
    RandomNumberGenerator randomNumberGenerator;

    public Set<Question> getQuestions(String groupId) {
        Set<Question> groupIds = questionsRepository.findByGroupIdIn(groupId);
        List<Question> groupIdList = new ArrayList<>(groupIds);
        Integer startRange = (groupIdList.get(0)) .questionId;
        Integer endRange = (groupIdList.get(19)).questionId;
        Set<Integer> randomNumbers = randomNumberGenerator.generate(startRange, endRange);
        return questionsRepository.findByQuestionIdInAndGroupId(randomNumbers, groupId);
    }

    public List<QuizGroup> getSearchResults(String userInput) {
        List<QuizGroup> quizGroups = new ArrayList<>(quizGroupRepository.findAll());
        List<QuizGroup> searchedGroups = new ArrayList<>();
        for (int groupIndex = 0; groupIndex <= (quizGroups.size()-1); groupIndex++) {
            if (FuzzySearch.ratio(quizGroups.get(groupIndex).quizName, userInput) >= 75) {
                searchedGroups.add(quizGroups.get(groupIndex));
            }
        } return searchedGroups;
    }
}
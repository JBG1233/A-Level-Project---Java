package com.questionnaire.service.Populate;

import com.questionnaire.domain.QuizGroup;
import com.questionnaire.repositories.QuizGroupRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
@Slf4j
public class PopulateDBGroups {

    @Autowired
    QuizGroupRepository quizGroupRepository;

    @PostConstruct
    public void createGroups() {

        createGroup("UK General Knowledge", "favicon.ico", "Think you know the UK? Take this quiz to prove your knowledge.", "GBPGK", "UK", "James Badham-Gill");
        createGroup("Brazil General Knowledge", "favicon.ico", "Think you know Brazil? Take this quiz to prove your knowledge.", "BRLGK", "Brazil", "James Badham-Gill");
        createGroup("Australia General Knowledge", "favicon.ico", "Think you know Australia? Take this quiz to prove your knowledge.", "AUSGK", "Australia", "James Badham-Gill");
        createGroup("China General Knowledge", "favicon.ico", "Think you know China? Take this quiz to prove your knowledge.", "CNYGK", "China", "James Badham-Gill");
        createGroup("Canada General Knowledge", "favicon.ico", "Think you know Canada? Take this quiz to prove your knowledge.", "CADGK", "Canada", "James Badham-Gill");
        createGroup("Minecraft General Knowledge", "favicon.ico", "Well done! You found my mini easter egg!    ", "MINECRAFT", "Minecraft", "James Badham-Gill");

    }

    public void createGroup(String quizName, String quizImage, String quizDescription, String groupId, String searchTerm, String authorName) {
        QuizGroup quizGroup = new QuizGroup();
        quizGroup.setQuizName(quizName);
        quizGroup.setQuizImage(quizImage);
        quizGroup.setQuizDescription(quizDescription);
        quizGroup.setGroupId(groupId);
        quizGroup.setSearchTerm(searchTerm);
        quizGroup.setAuthorName(authorName);
        //quizGroupRepository.save(quizGroup);
    }
}
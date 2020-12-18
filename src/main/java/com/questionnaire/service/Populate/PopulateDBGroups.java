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

        createGroup("UK", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/UK.jpg", "", "GBPGK", "UK");
        createGroup("Brazil", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/Brazil.jpg", "", "BRLGK", "Brazil");
        createGroup("Australia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/Australia.jpg", "", "AUSGK", "Australia");
        createGroup("China",  "https://myworldquizimages.s3.eu-west-2.amazonaws.com/China.jpg", "","CNYGK", "China");
        createGroup("Canada", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/Canada.jpg", "", "CADGK", "Canada");
        createGroup("20th Century America", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/20th+Century+America.jpg", "", "AMERICA1900H", "20th Century America");
        createGroup("19th Century America", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/19th+Century+America.jpg", "", "AMERICA1800H", "19th Century America");
        createGroup("18th Century America", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/18th+Century+America.jpg", "", "AMERICA1700H", "18th Century America");
        createGroup("17th Century America", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/17th+Century+America.jpg", "", "AMERICA1600H", "17th Century America");
        createGroup("16th Century America", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/16th+Century+America.jpg", "", "AMERICA1500H", "16th Century America");
        createGroup("15th Century America", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/15th+Century+America.jpg", "", "AMERICA1400H", "15th Century America");
        createGroup("14th Century America", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/14th+Century+America.jpg", "", "AMERICA1300H", "14th Century America");
        createGroup("20th Century Europe", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/20th+Century+Europe.jpg", "", "EUROPE1900H", "20th Century Europe");
        createGroup("19th Century Europe", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/19th+Century+Europe.jpg", "", "EUROPE1800H", "19th Century Europe");
        createGroup("18th Century Europe", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/18th+Century+Europe.png", "", "EUROPE1700H", "18th Century Europe");
        createGroup("17th Century Europe", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/17th+Century+Europe.jpg", "", "EUROPE1600H", "17th Century Europe");
        createGroup("16th Century Europe", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/16th+Century+Europe.jpg", "", "EUROPE1500H", "16th Century Europe");
        createGroup("15th Century Europe", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/15th+Century+Europe.jpg", "", "EUROPE1400H", "15th Century Europe");
        createGroup("14th Century Europe", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/14th+Century+Europe.jpg", "", "EUROPE1300H", "14th Century Europe");
        createGroup("20th Century Asia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/20th+Century+Asia.png", "", "ASIA1900H", "20th Century Asia");
        createGroup("19th Century Asia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/19th+Century+Asia.jpg", "", "ASIA1800H", "19th Century Asia");
        createGroup("18th Century Asia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/18th+Century+Asia.jpg", "", "ASIA1700H", "18th Century Asia");
        createGroup("17th Century Asia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/17th+Century+Asia.jpg", "", "ASIA1600H", "17th Century Asia");
        createGroup("16th Century Asia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/16th+Century+Asia.jpg", "", "ASIA1500H", "16th Century Asia");
        createGroup("15th Century Asia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/15th+Century+Asia.jpg", "", "ASIA1400H", "15th Century Asia");
        createGroup("14th Century Asia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/14th+Century+Asia.png", "", "ASIA1300H", "14th Century Asia");
        createGroup("Minecraft", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/Minecraft.jpg", "", "MINECRAFT", "Minecraft");

    }

    public void createGroup (String quizName, String quizImage, String quizDescription, String groupId, String searchTerm) {
        QuizGroup quizGroup = new QuizGroup();
        quizGroup.setQuizName(quizName);
        quizGroup.setQuizImage(quizImage);
        quizGroup.setQuizDescription(quizDescription);
        quizGroup.setGroupId(groupId);
        quizGroup.setSearchTerm(searchTerm);
        //quizGroupRepository.save(quizGroup);
    }
}

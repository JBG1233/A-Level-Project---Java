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

        createGroup("UK", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/UK.jpg", "", "GBPGK");
        createGroup("Brazil", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/Brazil.jpg", "", "BRLGK");
        createGroup("Australia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/Australia.jpg", "", "AUSGK");
        createGroup("China",  "https://myworldquizimages.s3.eu-west-2.amazonaws.com/China.jpg", "","CNYGK");
        createGroup("Canada", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/Canada.jpg", "", "CADGK");
        createGroup("20th Century America", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/20th+Century+America.jpg", "", "AMERICA1900H");
        createGroup("19th Century America", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/19th+Century+America.jpg", "", "AMERICA1800H");
        createGroup("18th Century America", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/18th+Century+America.jpg", "", "AMERICA1700H");
        createGroup("17th Century America", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/17th+Century+America.jpg", "", "AMERICA1600H");
        createGroup("16th Century America", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/16th+Century+America.jpg", "", "AMERICA1500H");
        createGroup("15th Century America", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/15th+Century+America.jpg", "", "AMERICA1400H");
        createGroup("14th Century America", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/14th+Century+America.jpg", "", "AMERICA1300H");
        createGroup("20th Century Europe", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/20th+Century+Europe.jpg", "", "EUROPE1900H");
        createGroup("19th Century Europe", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/19th+Century+Europe.jpg", "", "EUROPE1800H");
        createGroup("18th Century Europe", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/18th+Century+Europe.png", "", "EUROPE1700H");
        createGroup("17th Century Europe", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/17th+Century+Europe.jpg", "", "EUROPE1600H");
        createGroup("16th Century Europe", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/16th+Century+Europe.jpg", "", "EUROPE1500H");
        createGroup("15th Century Europe", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/15th+Century+Europe.jpg", "", "EUROPE1400H");
        createGroup("14th Century Europe", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/14th+Century+Europe.jpg", "", "EUROPE1300H");
        createGroup("20th Century Asia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/20th+Century+Asia.png", "", "ASIA1900H");
        createGroup("19th Century Asia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/19th+Century+Asia.jpg", "", "ASIA1800H");
        createGroup("18th Century Asia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/18th+Century+Asia.jpg", "", "ASIA1700H");
        createGroup("17th Century Asia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/17th+Century+Asia.jpg", "", "ASIA1600H");
        createGroup("16th Century Asia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/16th+Century+Asia.jpg", "", "ASIA1500H");
        createGroup("15th Century Asia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/15th+Century+Asia.jpg", "", "ASIA1400H");
        createGroup("14th Century Asia", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/14th+Century+Asia.png", "", "ASIA1300H");
        createGroup("Minecraft", "https://myworldquizimages.s3.eu-west-2.amazonaws.com/Minecraft.jpg", "", "MINECRAFT");

    }

    public void createGroup (String quizName, String quizImage, String quizDescription, String quizId) {
        QuizGroup quizGroup = new QuizGroup();
        quizGroup.setQuizName(quizName);
        quizGroup.setQuizImage(quizImage);
        quizGroup.setQuizDescription(quizDescription);
        quizGroup.setQuizId(quizId);
        //quizGroupRepository.save(quizGroup);
    }
}

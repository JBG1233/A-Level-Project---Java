package com.questionnaire.service;

import com.questionnaire.domain.Question;
import com.questionnaire.repositories.QuestionsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
@Slf4j
public class PopulateDBQuestions {

    @Autowired
    QuestionsRepository questionsRepository;

    @PostConstruct
    public void createQuestions() {

        //UK DATABASE POPULATION
        createQuestion("GBP", "What does a traditional English breakfast consist of", 1, "Bacon, Eggs, Sausages, Mushrooms, Beans, Toast and tomatoes");
        createQuestion("GBP", "Who was the first female Prime Minister", 2, "Margaret Thatcher");
        createQuestion("GBP", "Who is the heir to the throne?", 3, "Prince Charles");
        createQuestion("GBP", "What is the biggest island that surrounds the UK?", 4, "Lewis and Harris");
        createQuestion("GBP", "What was the wall that separated England with Scotland?", 5, "Hadrian's Wall");
        createQuestion("GBP", "What was Shakespeare's final play called?", 6, "The Two Noble Kinsmen");
        createQuestion("GBP", "What county was Edward Elgar born in? ", 7, "Worcestershire");
        createQuestion("GBP", "Who wrote the words to the hymn 'Jerusalem'?", 8, "William Blake");
        createQuestion("GBP", "Which poet has a national day in Scotland?", 9, "Robert Burns");
        createQuestion("GBP", "What country is giants causeway in?", 10, "Northern Ireland");
        createQuestion("GBP", "Who created the NHS?", 11, "Aneurin Bevan");
        createQuestion("GBP", "What is black pudding made out of?", 12, "Pigs blood");
        createQuestion("GBP", "What does the nursery rhyme 'Ring a ring a roses' refer too?", 13, "The plague");
        createQuestion("GBP", "What makes you a cockney?", 14, "Born within earshot of the bells at St Mary-le-bow church");
        createQuestion("GBP", "What did the Scottish inventor John Logie Baird?", 15, "The television");
        createQuestion("GBP", "What is Cornwall famous for mining?", 16, "Tin");
        createQuestion("GBP", "Who were the original two presenters of the great british bake off?", 17, "Mary Berry and Paul Hollywood");
        createQuestion("GBP", "What is the difference between a Shepard's pie and a Cottage pie?", 18, "Shepard's pie is made with lamb whereas Cottage pie is not");
        createQuestion("GBP", "Which mountain range is often described as the ‘backbone of England’?", 19, "The Pennines");
        createQuestion("GBP", "What is the national flower of Wales?", 20, "Daffodil");

        //CANADA DATABASE POPULATION
        createQuestion("CAD", "How many time zones does Canada have?", 1, "six");
        createQuestion("CAD", "How many oceans border Canada?", 2, "three");
        createQuestion("CAD", "If hockey is Canada's national winter sport, what is its national summer sport?", 3, "Lacrosse");
        createQuestion("CAD", "Who became the prime minister on November 4, 2015?", 4, "Justin Trudeau");
        createQuestion("CAD", "What city is the CN Tower in?", 5, "Toronto");
        createQuestion("CAD", "What is the Canadian dish made with french fries, topped with cheese curds and a brown gravy-like sauce?", 6, "Poutine");
        createQuestion("CAD", "What year was the Trans-Canada Highway finally completed?", 7, "1971");
        createQuestion("CAD", "What is the largest city in Canada?", 8, "Toronto");
        createQuestion("CAD", "How many provinces does Canada have?", 9, "ten");
        createQuestion("CAD", "What is the longest river in Canada called?", 10, "Mackenzie River");
        createQuestion("CAD", "What date did Canada get its independence from the Great Britain?", 11, "1st July 1867");
        createQuestion("CAD", "What is the longest bridge in Canada", 12, "Confederation Bridge");
        createQuestion("CAD", "What did Canadian and Soviet skiers attempt in 1988?", 13, "Cross from USSR to Canada via North Pole");
        createQuestion("CAD", "Which Canadian actor played lead roles in the forties films 'How Green Was My Valley' and 'Mrs Miniver'?", 14, "Walter Pidgeon");
        createQuestion("CAD", "How many points does the Maple Leaf on the flag have?", 15, "eleven");
        createQuestion("CAD", "Which city is home to NA's biggest mall?", 16, "Edmonton");
        createQuestion("CAD", "Where is Canada's most visited national historic site?", 17, "Halifax");
        createQuestion("CAD", "Which city has the most restaurants per capita in Canada?", 18, "Montreal");
        createQuestion("CAD", "Canada is the largest exporter of which fruit?", 19, "Blueberries");
        createQuestion("CAD", "What is Canada's oldest city?", 20, "St. Johns");

        //AUSTRALIA DATABASE POPULATION
        createQuestion("AUS", "Who was the most recent Australian to win the men’s singles title at Wimbledon?", 1, "Lleyton Hewitt");
        createQuestion("AUS", "In what city did the Commonwealth Parliament first sit?", 2, "Melbourne");
        createQuestion("AUS", "Who painted the Nebuchadnezzar series?", 3, "Arthur Boyd");
        createQuestion("AUS", "In what year was decimal currency introduced?", 4, "1966");
        createQuestion("AUS", "Who is the longest serving presenter of Playschool?", 5, "Benita");
        createQuestion("AUS", "What percent of Australia is classified as desert?", 6, "35%");
        createQuestion("AUS", "In rhyming slang, if someone said they we going to have a “bo-peep”, what may they be doing?", 7, "Having a sleep");
        createQuestion("AUS", "What is South Australia’s largest island?", 8, "Kangaroo Island");
        createQuestion("AUS", "How many ships were in the first fleet?", 9, "eleven");
        createQuestion("AUS", "What is South Australia’s largest island?", 10, "one cent    ");
        createQuestion("AUS", "What is a triantiwontigongolope?", 11, "A mythical insect");
        createQuestion("AUS", "Are there more kangaroos or humans in Australia?", 12, "Kangaroos");
        createQuestion("AUS", "How many states does Australia have?", 13, "six");
        createQuestion("AUS", "What constallation is depicted on the Australian flag?", 14, "The southern cross");
        createQuestion("AUS", "Australian, Julian Assange, founder of Wikileaks, was born in which region?", 15, "Queensland");
        createQuestion("AUS", "", 16, "");
        createQuestion("AUS", "What is a quandong?", 17, "A fruit");
        createQuestion("AUS", "", 18, "");
        createQuestion("AUS", "", 19, "");
        createQuestion("AUS", "", 20, "");

        //BRAZIL DATABASE POPULATION
        createQuestion("BRL", "", 1, "");
        createQuestion("BRL", "", 2, "");
        createQuestion("BRL", "", 3, "");
        createQuestion("BRL", "", 4, "");
        createQuestion("BRL", "", 5, "");
        createQuestion("BRL", "", 6, "");
        createQuestion("BRL", "", 7, "");
        createQuestion("BRL", "", 8, "");
        createQuestion("BRL", "", 9, "");
        createQuestion("BRL", "", 10, "");
        createQuestion("BRL", "", 11, "");
        createQuestion("BRL", "", 12, "");
        createQuestion("BRL", "", 13, "");
        createQuestion("BRL", "", 14, "");
        createQuestion("BRL", "", 15, "");
        createQuestion("BRL", "", 16, "");
        createQuestion("BRL", "", 17, "");
        createQuestion("BRL", "", 18, "");
        createQuestion("BRL", "", 19, "");
        createQuestion("BRL", "", 20, "");

        //CHINA DATABASE POPULATION
        createQuestion("CNY", "", 1, "");
        createQuestion("CNY", "", 2, "");
        createQuestion("CNY", "", 3, "");
        createQuestion("CNY", "", 4, "");
        createQuestion("CNY", "", 5, "");
        createQuestion("CNY", "", 6, "");
        createQuestion("CNY", "", 7, "");
        createQuestion("CNY", "", 8, "");
        createQuestion("CNY", "", 9, "");
        createQuestion("CNY", "", 10, "");
        createQuestion("CNY", "", 11, "");
        createQuestion("CNY", "", 12, "");
        createQuestion("CNY", "", 13, "");
        createQuestion("CNY", "", 14, "");
        createQuestion("CNY", "", 15, "");
        createQuestion("CNY", "", 16, "");
        createQuestion("CNY", "", 17, "");
        createQuestion("CNY", "", 18, "");
        createQuestion("CNY", "", 19, "");
        createQuestion("CNY", "", 20, "");
    }

    public void createQuestion(String questionCode, String questionText, int questionNumber, String questionAnswer) {
        if (questionsRepository.findByQuestionNumberInAndQuestionCodeIn(1, "GBP") == null) {
            Question question = new Question();
            question.setQuestionCode(questionCode);
            question.setQuestionText(questionText);
            question.setQuestionNumber(questionNumber);
            question.setQuestionAnswer(questionAnswer);
            questionsRepository.save(question);
        }
    }
}

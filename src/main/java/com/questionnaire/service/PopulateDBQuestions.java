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
        createQuestion("GBP", "What meat does a Sheperd's pie have that a Cottage pie does not?", 18, "Lamb");
        createQuestion("GBP", "Which mountain range is often described as the ‘backbone of England’?", 19, "The Pennines");
        createQuestion("GBP", "What is the national flower of Wales?", 20, "Daffodil");

        //CANADA DATABASE POPULATION
        createQuestion("CAD", "How many time zones does Canada have?", 1, "6");
        createQuestion("CAD", "How many oceans border Canada?", 2, "3");
        createQuestion("CAD", "If hockey is Canada's national winter sport, what is its national summer sport?", 3, "Lacrosse");
        createQuestion("CAD", "Who became the prime minister on November 4, 2015?", 4, "Justin Trudeau");
        createQuestion("CAD", "What city is the CN Tower in?", 5, "Toronto");
        createQuestion("CAD", "What is the Canadian dish made with french fries, topped with cheese curds and a brown gravy-like sauce?", 6, "Poutine");
        createQuestion("CAD", "What year was the Trans-Canada Highway finally completed?", 7, "1971");
        createQuestion("CAD", "What is the largest city in Canada?", 8, "Toronto");
        createQuestion("CAD", "How many provinces does Canada have?", 9, "10");
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
        createQuestion("AUS", "How many ships were in the first fleet?", 9, "11");
        createQuestion("AUS", "What is South Australia’s largest island?", 10, "one cent");
        createQuestion("AUS", "What is a triantiwontigongolope?", 11, "A mythical insect");
        createQuestion("AUS", "Are there more kangaroos or humans in Australia?", 12, "Kangaroos");
        createQuestion("AUS", "How many states does Australia have?", 13, "6");
        createQuestion("AUS", "What constallation is depicted on the Australian flag?", 14, "The southern cross");
        createQuestion("AUS", "Australian, Julian Assange, founder of Wikileaks, was born in which region?", 15, "Queensland");
        createQuestion("AUS", "Hugh Jackman was born in which city?", 16, "Sydney");
        createQuestion("AUS", "What is a quandong?", 17, "A fruit");
        createQuestion("AUS", "Which venue has hosted the Australian Open since 1988?", 18, "Melbourne Park");
        createQuestion("AUS", "Which food product rich in vitamin B did Cyril Callister develop?", 19, "Vegimite");
        createQuestion("AUS", "Which singer/songwriter went to number 1 with his debut single 'Telluric' in 2016?", 20, "Matt Corby");

        //BRAZIL DATABASE POPULATION
        createQuestion("BRL", "In Brazil, in 1988, there was an epidemic of a tropical disease of which there were 500,000 reported cases. Which disease?", 1, "Malaria");
        createQuestion("BRL", "What percentage of the world's tropical rain forests are in Brazil?", 2, "33%");
        createQuestion("BRL", "What is the name of the world's largest soccer stadium in Rio De Janeiro?", 3, "Maracana Stadium");
        createQuestion("BRL", "Which 2 South American countries do not share a border with Brazil?", 4, "Chile and Ecuador");
        createQuestion("BRL", "What age do you need to be able to be to vote in Brazil?", 5, "16");
        createQuestion("BRL", "What is the word carioca used to describe in Rio?", 6, "Local People");
        createQuestion("BRL", "How many times has Brazil won the world cup?", 7, "5 times");
        createQuestion("BRL", "What is the national bird of Brazil?", 8, "Rufous-bellied Thrush");
        createQuestion("BRL", "Name the four colours of the flag.", 9, "Blue, White, Green and Yellow");
        createQuestion("BRL", "What is the official language of Brazil?", 10, "Portuguese");
        createQuestion("BRL", "How many states are in Brazil", 11, "26");
        createQuestion("BRL", "What is the capital city of Brazil?", 12, "Brasilia");
        createQuestion("BRL", "Was Rio de Janero the first South American city to host the olympic games?", 13, "Yes");
        createQuestion("BRL", "What age can you vote in Brazil", 14, "16");
        createQuestion("BRL", "What percentage of the Brazilian population has Silva as a surname?", 15, "10");
        createQuestion("BRL", "Did Rio’s famous Christ the Redeemer statue lose a thumb in a thunder storm in 2014?", 16, "Yes");
        createQuestion("BRL", "The national dish of Brazil is feijoada, but what is it exactly?", 17, "A stew made from black beans, sausages and pork");
        createQuestion("BRL", "What kind of behaviour does 'O jeitinho brasileir' or ‘The little  Brazilian way’ denote? ", 18, "A cheeky little rule breaking");
        createQuestion("BRL", "How many times was the Brazilian Ayrton Senna the Formula 1 world champion?", 19, "3");
        createQuestion("BRL", "Who plays the part of Josef Mengele in the 1978 film 'The Boys From Brazil'?", 20, "Gregory Peck");

        //CHINA DATABASE POPULATION
        createQuestion("CNY", "What is the fear of China or Chinese called?", 1, "Sinophobia");
        createQuestion("CNY", "Cha dao is the art of what?", 2, "Making tea");
        createQuestion("CNY", "Translate Feng-shui.", 3, "Wind and water");
        createQuestion("CNY", "Which was the first British pop group to tour China?", 4, "Wham.");
        createQuestion("CNY", "In which Chinese City can you see the Terracotta Army?", 5, "Xi'an");
        createQuestion("CNY", "What was the name of an ancient road, linking China with the West running through Afghanistan and the Middle East, used by Marco Polo to travel to China?", 6, "Silk Road");
        createQuestion("CNY", "How many days did the famous Long March of the Chinese Communists (1934-1935) last?", 7, "368");
        createQuestion("CNY", "Which bird is trained by the Chinese to catch fish?", 8, "The cormorant");
        createQuestion("CNY", "What is the population of China?", 9, "1.43 billion");
        createQuestion("CNY", "How many countries does China border?", 10, "14");
        createQuestion("CNY", "How many provinces does China have?", 11, "23");
        createQuestion("CNY", "How many timezones does China have?", 12, "1");
        createQuestion("CNY", "What percent of the county is desert?", 13, "20");
        createQuestion("CNY", "How long is China's Great Wall? (KM)", 14, "8,850");
        createQuestion("CNY", "How many megacities are in China?", 15, "33");
        createQuestion("CNY", "How many zoidac signs are there?", 16, "12");
        createQuestion("CNY", "What does the dragon symbolise?", 17, "Strength and prosperity");
        createQuestion("CNY", "What does 'Xie Xie' mean?", 18, "Thank you");
        createQuestion("CNY", "What is Dim Sum?", 19, "Steamed dumplings filled with minced meat or vegetables");
        createQuestion("CNY", "What is Chow Mein?", 20, "Stir-fried egg noodles with chicken strips");
    }

    public void createQuestion(String questionCode, String questionText, int questionNumber, String questionAnswer) {
            //Question question = new Question();
            //question.setQuestionCode(questionCode);
            //question.setQuestionText(questionText);
            //question.setQuestionNumber(questionNumber);
            //question.setQuestionAnswer(questionAnswer);
            //questionsRepository.save(question);
    }
}

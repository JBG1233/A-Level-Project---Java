package com.questionnaire.service.Populate;

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

        //UK GENERAL KNOWLEDGE POPULATION
        createQuestion("GBPGK", "What does a traditional English breakfast consist of", 1, "Bacon, Eggs, Sausages, Mushrooms, Beans, Toast and tomatoes");
        createQuestion("GBPGK", "Who was the first female Prime Minister", 2, "Margaret Thatcher");
        createQuestion("GBPGK", "Who is the heir to the throne?", 3, "Prince Charles");
        createQuestion("GBPGK", "What is the biggest island that surrounds the UK?", 4, "Lewis and Harris");
        createQuestion("GBPGK", "What was the wall that separated England with Scotland?", 5, "Hadrian's Wall");
        createQuestion("GBPGK", "What was Shakespeare's final play called?", 6, "The Two Noble Kinsmen");
        createQuestion("GBPGK", "What county was Edward Elgar born in? ", 7, "Worcestershire");
        createQuestion("GBPGK", "Who wrote the words to the hymn 'Jerusalem'?", 8, "William Blake");
        createQuestion("GBPGK", "Which poet has a national day in Scotland?", 9, "Robert Burns");
        createQuestion("GBPGK", "What country is giants causeway in?", 10, "Northern Ireland");
        createQuestion("GBPGK", "Who created the NHS?", 11, "Aneurin Bevan");
        createQuestion("GBPGK", "What is black pudding made out of?", 12, "Pigs blood");
        createQuestion("GBPGK", "What does the nursery rhyme 'Ring a ring a roses' refer too?", 13, "The plague");
        createQuestion("GBPGK", "What makes you a cockney?", 14, "Born within earshot of the bells at St Mary-le-bow church");
        createQuestion("GBPGK", "What did the Scottish inventor John Logie Baird?", 15, "The television");
        createQuestion("GBPGK", "What is Cornwall famous for mining?", 16, "Tin");
        createQuestion("GBPGK", "Who were the original two presenters of the great british bake off?", 17, "Mary Berry and Paul Hollywood");
        createQuestion("GBPGK", "What meat does a Sheperd's pie have that a Cottage pie does not?", 18, "Lamb");
        createQuestion("GBPGK", "Which mountain range is often described as the ‘backbone of England’?", 19, "The Pennines");
        createQuestion("GBPGK", "What is the national flower of Wales?", 20, "Daffodil");

        //CANADA GENERAL KNOWLEDGE POPULATION
        createQuestion("CADGK", "How many time zones does Canada have?", 21, "6");
        createQuestion("CADGK", "How many oceans border Canada?", 22, "3");
        createQuestion("CADGK", "If hockey is Canada's national winter sport, what is its national summer sport?", 23, "Lacrosse");
        createQuestion("CADGK", "Who became the prime minister on November 4, 2015?", 24, "Justin Trudeau");
        createQuestion("CADGK", "What city is the CN Tower in?", 25, "Toronto");
        createQuestion("CADGK", "What is the Canadian dish made with french fries, topped with cheese curds and a brown gravy-like sauce?", 26, "Poutine");
        createQuestion("CADGK", "What year was the Trans-Canada Highway finally completed?", 27, "1971");
        createQuestion("CADGK", "What is the largest city in Canada?", 28, "Toronto");
        createQuestion("CADGK", "How many provinces does Canada have?", 29, "10");
        createQuestion("CADGK", "What is the longest river in Canada called?", 30, "Mackenzie River");
        createQuestion("CADGK", "What date did Canada get its independence from the Great Britain?", 31, "1st July 1867");
        createQuestion("CADGK", "What is the longest bridge in Canada", 32, "Confederation Bridge");
        createQuestion("CADGK", "What did Canadian and Soviet skiers attempt in 1988?", 33, "Cross from USSR to Canada via North Pole");
        createQuestion("CADGK", "Which Canadian actor played lead roles in the forties films 'How Green Was My Valley' and 'Mrs Miniver'?", 34, "Walter Pidgeon");
        createQuestion("CADGK", "How many points does the Maple Leaf on the flag have?", 35, "eleven");
        createQuestion("CADGK", "Which city is home to NA's biggest mall?", 36, "Edmonton");
        createQuestion("CADGK", "Where is Canada's most visited national historic site?", 37, "Halifax");
        createQuestion("CADGK", "Which city has the most restaurants per capita in Canada?", 38, "Montreal");
        createQuestion("CADGK", "Canada is the largest exporter of which fruit?", 39, "Blueberries");
        createQuestion("CADGK", "What is Canada's oldest city?", 40, "St. Johns");

        //AUSTRALIA GENERAL KNOWLEDGE POPULATION
        createQuestion("AUSGK", "Who was the most recent Australian to win the men’s singles title at Wimbledon?", 41, "Lleyton Hewitt");
        createQuestion("AUSGK", "In what city did the Commonwealth Parliament first sit?", 42, "Melbourne");
        createQuestion("AUSGK", "Who painted the Nebuchadnezzar series?", 43, "Arthur Boyd");
        createQuestion("AUSGK", "In what year was decimal currency introduced?", 44, "1966");
        createQuestion("AUSGK", "Who is the longest serving presenter of Playschool?", 45, "Benita");
        createQuestion("AUSGK", "What percent of Australia is classified as desert?", 46, "35%");
        createQuestion("AUSGK", "In rhyming slang, if someone said they we going to have a “bo-peep”, what may they be doing?", 47, "Having a sleep");
        createQuestion("AUSGK", "What is South Australia’s largest island?", 48, "Kangaroo Island");
        createQuestion("AUSGK", "How many ships Australia in the first fleet?", 49, "11");
        createQuestion("AUSGK", "What is South Australia’s largest island?", 50, "one cent");
        createQuestion("AUSGK", "What is a triantiwontigongolope?", 51, "A mythical insect");
        createQuestion("AUSGK", "Are there more kangaroos or humans in Australia?", 52, "Kangaroos");
        createQuestion("AUSGK", "How many states does Australia have?", 53, "6");
        createQuestion("AUSGK", "What constallation is depicted on the Australia flag?", 54, "The southern cross");
        createQuestion("AUSGK", "Australian, Julian Assange, founder of Wikileaks, was born in which region?", 55, "Queensland");
        createQuestion("AUSGK", "Hugh Jackman was born in which city?", 56, "Sydney");
        createQuestion("AUSGK", "What is a quandong?", 57, "A fruit");
        createQuestion("AUSGK", "Which venue has hosted the Australia Open since 1988?", 58, "Melbourne Park");
        createQuestion("AUSGK", "Which food product rich in vitamin B did Cyril Callister develop?", 59, "Vegimite");
        createQuestion("AUSGK", "Which singer/songwriter went to number 1 with his debut single 'Telluric' in 2016?", 60, "Matt Corby");

        //BRAZIL GENERAL KNOWLEDGE POPULATION
        createQuestion("BRLGK", "In Brazil, in 1988, there was an epidemic of a tropical disease of which there were 500,000 reported cases. Which disease?", 61, "Malaria");
        createQuestion("BRLGK", "What percentage of the world's tropical rain forests are in Brazil?", 62, "33%");
        createQuestion("BRLGK", "What is the name of the world's largest soccer stadium in Rio De Janeiro?", 63, "Maracana Stadium");
        createQuestion("BRLGK", "Which 2 South American countries do not share a border with Brazil?", 64, "Chile and Ecuador");
        createQuestion("BRLGK", "What age do you need to be able to be to vote in Brazil?", 65, "16");
        createQuestion("BRLGK", "What is the word carioca used to describe in Rio?", 66, "Local People");
        createQuestion("BRLGK", "How many times has Brazil won the world cup?", 67, "5 times");
        createQuestion("BRLGK", "What is the national bird of Brazil?", 68, "Rufous-bellied Thrush");
        createQuestion("BRLGK", "Name the four colours of the flag.", 69, "Blue, White, Green and Yellow");
        createQuestion("BRLGK", "What is the official language of Brazil?", 70, "Portuguese");
        createQuestion("BRLGK", "How many states are in Brazil", 71, "26");
        createQuestion("BRLGK", "What is the capital city of Brazil?", 72, "Brasilia");
        createQuestion("BRLGK", "Was Rio de Janero the first South American city to host the olympic games?", 73, "Yes");
        createQuestion("BRLGK", "What age can you vote in Brazil", 74, "16");
        createQuestion("BRLGK", "What percentage of the Brazilian population has Silva as a surname?", 75, "10");
        createQuestion("BRLGK", "Did Rio’s famous Christ the Redeemer statue lose a thumb in a thunder storm in 2014?", 76, "Yes");
        createQuestion("BRLGK", "The national dish of Brazil is feijoada, but what is it exactly?", 77, "A stew made from black beans, sAUSGKages and pork");
        createQuestion("BRLGK", "What kind of behaviour does 'O jeitinho brasileir' or ‘The little  Brazilian way’ denote? ", 78, "A cheeky little rule breaking");
        createQuestion("BRLGK", "How many times was the Brazilian Ayrton Senna the Formula 1 world champion?", 79, "3");
        createQuestion("BRLGK", "Who plays the part of Josef Mengele in the 1978 film 'The Boys From Brazil'?", 80, "Gregory Peck");

        //CHINA GENERAL KNOWLEDGE POPULATION
        createQuestion("CNYGK", "What is the fear of China or Chinese called?", 81, "Sinophobia");
        createQuestion("CNYGK", "Cha dao is the art of what?", 82, "Making tea");
        createQuestion("CNYGK", "Translate Feng-shui.", 83, "Wind and water");
        createQuestion("CNYGK", "Which was the first British pop group to tour China?", 84, "Wham.");
        createQuestion("CNYGK", "In which Chinese City can you see the Terracotta Army?", 85, "Xi'an");
        createQuestion("CNYGK", "What was the name of an ancient road, linking China with the West running through Afghanistan and the Middle East, used by Marco Polo to travel to China?", 86, "Silk Road");
        createQuestion("CNYGK", "How many days did the famous Long March of the Chinese Communists (1934-1935) last?", 87, "368");
        createQuestion("CNYGK", "Which bird is trained by the Chinese to catch fish?", 88, "The cormorant");
        createQuestion("CNYGK", "What is the population of China? (Include unit) ", 89, "1.43 billion");
        createQuestion("CNYGK", "How many countries does China border?", 90, "14");
        createQuestion("CNYGK", "How many provinces does China have?", 91, "23");
        createQuestion("CNYGK", "How many timezones does China have?", 92, "1");
        createQuestion("CNYGK", "What percent of the county is desert?", 93, "20");
        createQuestion("CNYGK", "How long is China's Great Wall? (KM)", 94, "8,850");
        createQuestion("CNYGK", "How many mega cities are in China?", 95, "33");
        createQuestion("CNYGK", "How many zoidac signs are there?", 96, "12");
        createQuestion("CNYGK", "What does the dragon symbolise?", 97, "Strength and prosperity");
        createQuestion("CNYGK", "What does 'Xie Xie' mean?", 98, "Thank you");
        createQuestion("CNYGK", "What is Dim Sum?", 99, "Steamed dumplings filled with minced meat or vegetables");
        createQuestion("CNYGK", "What is Chow Mein?", 100, "Stir-fried egg noodles with chicken strips");

    }

    public void createQuestion(String groupId, String questionText, Integer questionId, String questionAnswer) {
            Question question = new Question();
            question.setGroupId(groupId);
            question.setQuestionText(questionText);
            question.setQuestionId(questionId);
            question.setQuestionAnswer(questionAnswer);
            //questionsRepository.save(question);
    }
}

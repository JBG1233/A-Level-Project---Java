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
        createQuestion("CADGK", "What is the Canadian dish made with french fries, topped with cheese curds and a brown gravy-like sauce?", 6, "Poutine");
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
        createQuestion("CNYGK", "What is the population of China?", 89, "1.43 billion");
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

        //AMERICA 1900 HISTORY POPULATION
        createQuestion("AMERICA1900H", "", 101, "");
        createQuestion("AMERICA1900H", "", 102, "");
        createQuestion("AMERICA1900H", "", 103, "");
        createQuestion("AMERICA1900H", "", 104, "");
        createQuestion("AMERICA1900H", "", 105, "");
        createQuestion("AMERICA1900H", "", 106, "");
        createQuestion("AMERICA1900H", "", 107, "");
        createQuestion("AMERICA1900H", "", 108, "");
        createQuestion("AMERICA1900H", "", 109, "");
        createQuestion("AMERICA1900H", "", 110, "");
        createQuestion("AMERICA1900H", "", 111, "");
        createQuestion("AMERICA1900H", "", 112, "");
        createQuestion("AMERICA1900H", "", 113, "");
        createQuestion("AMERICA1900H", "", 114, "");
        createQuestion("AMERICA1900H", "", 115, "");
        createQuestion("AMERICA1900H", "", 116, "");
        createQuestion("AMERICA1900H", "", 117, "");
        createQuestion("AMERICA1900H", "", 118, "");
        createQuestion("AMERICA1900H", "", 119, "");
        createQuestion("AMERICA1900H", "", 120, "");

        //AMERICA 1800 HISTORY POPULATION
        createQuestion("AMERICA1800H", "What year did the Mexican American war start?", 121, "1846");
        createQuestion("AMERICA1800H", "What was the population of the U.S. in 1850?", 122, "50 million");
        createQuestion("AMERICA1800H", "What percent of Americans lived in a city in 1860?", 123, "20%");
        createQuestion("AMERICA1800H", "What were between an American nation and an European nation occurred in 1898?", 124, "The Spanish-American War");
        createQuestion("AMERICA1800H", "John Adams took up residency in the white house on what date?", 125, "1.11.1800");
        createQuestion("AMERICA1800H", "What year did the Argentine War of Independence end?", 126, "1818");
        createQuestion("AMERICA1800H", "Who was the general that took command of the army of the north in 1814?", 127, "General José de San Martín");
        createQuestion("AMERICA1800H", "What was the military campaign called that started in 1870s led by General Julio Argentino Roca?", 128, "Conquest of the Desert");
        createQuestion("AMERICA1800H", "What year did the California gold rush start?", 129, "1848");
        createQuestion("AMERICA1800H", "What year did the California gold rush end?", 130, "1855");
        createQuestion("AMERICA1800H", "Who won the election on November 2nd 1880?", 131, "James A. Garfield");
        createQuestion("AMERICA1800H", "What year was the Royal Bermuda Yacht Club established?", 132, "1844");
        createQuestion("AMERICA1800H", "How many years did the Brazil empire last?", 133, "67");
        createQuestion("AMERICA1800H", "", 134, "");
        createQuestion("AMERICA1800H", "", 135, "");
        createQuestion("AMERICA1800H", "", 136, "");
        createQuestion("AMERICA1800H", "", 137, "");
        createQuestion("AMERICA1800H", "", 138, "");
        createQuestion("AMERICA1800H", "", 139, "");
        createQuestion("AMERICA1800H", "", 140, "");

        //AMERICA 1700 HISTORY POPULATION
        createQuestion("AMERICA1700H", "", 141, "");
        createQuestion("AMERICA1700H", "", 142, "");
        createQuestion("AMERICA1700H", "", 143, "");
        createQuestion("AMERICA1700H", "", 144, "");
        createQuestion("AMERICA1700H", "", 145, "");
        createQuestion("AMERICA1700H", "", 146, "");
        createQuestion("AMERICA1700H", "", 147, "");
        createQuestion("AMERICA1700H", "", 148, "");
        createQuestion("AMERICA1700H", "", 149, "");
        createQuestion("AMERICA1700H", "", 150, "");
        createQuestion("AMERICA1700H", "", 151, "");
        createQuestion("AMERICA1700H", "", 152, "");
        createQuestion("AMERICA1700H", "", 153, "");
        createQuestion("AMERICA1700H", "", 154, "");
        createQuestion("AMERICA1700H", "", 155, "");
        createQuestion("AMERICA1700H", "", 156, "");
        createQuestion("AMERICA1700H", "", 157, "");
        createQuestion("AMERICA1700H", "", 158, "");
        createQuestion("AMERICA1700H", "", 159, "");
        createQuestion("AMERICA1700H", "", 160, "");

        //AMERICA 1600 HISTORY POPULATION
        createQuestion("AMERICA1600H", "", 161, "");
        createQuestion("AMERICA1600H", "", 162, "");
        createQuestion("AMERICA1600H", "", 163, "");
        createQuestion("AMERICA1600H", "", 164, "");
        createQuestion("AMERICA1600H", "", 165, "");
        createQuestion("AMERICA1600H", "", 166, "");
        createQuestion("AMERICA1600H", "", 167, "");
        createQuestion("AMERICA1600H", "", 168, "");
        createQuestion("AMERICA1600H", "", 169, "");
        createQuestion("AMERICA1600H", "", 170, "");
        createQuestion("AMERICA1600H", "", 171, "");
        createQuestion("AMERICA1600H", "", 172, "");
        createQuestion("AMERICA1600H", "", 173, "");
        createQuestion("AMERICA1600H", "", 174, "");
        createQuestion("AMERICA1600H", "", 175, "");
        createQuestion("AMERICA1600H", "", 176, "");
        createQuestion("AMERICA1600H", "", 177, "");
        createQuestion("AMERICA1600H", "", 178, "");
        createQuestion("AMERICA1600H", "", 179, "");
        createQuestion("AMERICA1600H", "", 180, "");

        //AMERICA 1500 HISTORY POPULATION
        createQuestion("AMERICA1500H", "", 181, "");
        createQuestion("AMERICA1500H", "", 182, "");
        createQuestion("AMERICA1500H", "", 183, "");
        createQuestion("AMERICA1500H", "", 184, "");
        createQuestion("AMERICA1500H", "", 185, "");
        createQuestion("AMERICA1500H", "", 186, "");
        createQuestion("AMERICA1500H", "", 187, "");
        createQuestion("AMERICA1500H", "", 188, "");
        createQuestion("AMERICA1500H", "", 189, "");
        createQuestion("AMERICA1500H", "", 180, "");
        createQuestion("AMERICA1500H", "", 191, "");
        createQuestion("AMERICA1500H", "", 192, "");
        createQuestion("AMERICA1500H", "", 193, "");
        createQuestion("AMERICA1500H", "", 194, "");
        createQuestion("AMERICA1500H", "", 195, "");
        createQuestion("AMERICA1500H", "", 196, "");
        createQuestion("AMERICA1500H", "", 197, "");
        createQuestion("AMERICA1500H", "", 198, "");
        createQuestion("AMERICA1500H", "", 199, "");
        createQuestion("AMERICA1500H", "", 200, "");

        //AMERICA 1400 HISTORY POPULATION
        createQuestion("AMERICA1400H", "What year did Cristopher Columbus land in the Americas?", 201, "1492");
        createQuestion("AMERICA1400H", "", 202, "");
        createQuestion("AMERICA1400H", "", 203, "");
        createQuestion("AMERICA1400H", "", 204, "");
        createQuestion("AMERICA1400H", "", 205, "");
        createQuestion("AMERICA1400H", "", 206, "");
        createQuestion("AMERICA1400H", "", 207, "");
        createQuestion("AMERICA1400H", "", 208, "");
        createQuestion("AMERICA1400H", "", 209, "");
        createQuestion("AMERICA1400H", "", 210, "");
        createQuestion("AMERICA1400H", "", 211, "");
        createQuestion("AMERICA1400H", "", 212, "");
        createQuestion("AMERICA1400H", "", 213, "");
        createQuestion("AMERICA1400H", "", 214, "");
        createQuestion("AMERICA1400H", "", 215, "");
        createQuestion("AMERICA1400H", "", 216, "");
        createQuestion("AMERICA1400H", "", 217, "");
        createQuestion("AMERICA1400H", "", 218, "");
        createQuestion("AMERICA1400H", "", 219, "");
        createQuestion("AMERICA1400H", "", 220, "");

        //AMERICA 1300 HISTORY POPULATION
        createQuestion("AMERICA1300H", "", 221, "");
        createQuestion("AMERICA1300H", "", 222, "");
        createQuestion("AMERICA1300H", "", 223, "");
        createQuestion("AMERICA1300H", "", 224, "");
        createQuestion("AMERICA1300H", "", 225, "");
        createQuestion("AMERICA1300H", "", 226, "");
        createQuestion("AMERICA1300H", "", 227, "");
        createQuestion("AMERICA1300H", "", 228, "");
        createQuestion("AMERICA1300H", "", 229, "");
        createQuestion("AMERICA1300H", "", 230, "");
        createQuestion("AMERICA1300H", "", 231, "");
        createQuestion("AMERICA1300H", "", 232, "");
        createQuestion("AMERICA1300H", "", 233, "");
        createQuestion("AMERICA1300H", "", 234, "");
        createQuestion("AMERICA1300H", "", 235, "");
        createQuestion("AMERICA1300H", "", 236, "");
        createQuestion("AMERICA1300H", "", 237, "");
        createQuestion("AMERICA1300H", "", 238, "");
        createQuestion("AMERICA1300H", "", 239, "");
        createQuestion("AMERICA1300H", "", 240, "");

        //EUROPE 1300 HISTORY POPULATION
        createQuestion("EUROPE1900H", "", 241, "");
        createQuestion("EUROPE1900H", "", 242, "");
        createQuestion("EUROPE1900H", "", 243, "");
        createQuestion("EUROPE1900H", "", 244, "");
        createQuestion("EUROPE1900H", "", 245, "");
        createQuestion("EUROPE1900H", "", 246, "");
        createQuestion("EUROPE1900H", "", 247, "");
        createQuestion("EUROPE1900H", "", 248, "");
        createQuestion("EUROPE1900H", "", 249, "");
        createQuestion("EUROPE1900H", "", 250, "");
        createQuestion("EUROPE1900H", "", 251, "");
        createQuestion("EUROPE1900H", "", 252, "");
        createQuestion("EUROPE1900H", "", 253, "");
        createQuestion("EUROPE1900H", "", 254, "");
        createQuestion("EUROPE1900H", "", 255, "");
        createQuestion("EUROPE1900H", "", 256, "");
        createQuestion("EUROPE1900H", "", 257, "");
        createQuestion("EUROPE1900H", "", 258, "");
        createQuestion("EUROPE1900H", "", 259, "");
        createQuestion("EUROPE1900H", "", 260, "");

        //EUROPE 1800 HISTORY POPULATION
        createQuestion("EUROPE1800H", "", 261, "");
        createQuestion("EUROPE1800H", "", 262, "");
        createQuestion("EUROPE1800H", "", 263, "");
        createQuestion("EUROPE1800H", "", 264, "");
        createQuestion("EUROPE1800H", "", 265, "");
        createQuestion("EUROPE1800H", "", 266, "");
        createQuestion("EUROPE1800H", "", 267, "");
        createQuestion("EUROPE1800H", "", 268, "");
        createQuestion("EUROPE1800H", "", 269, "");
        createQuestion("EUROPE1800H", "", 270, "");
        createQuestion("EUROPE1800H", "", 271, "");
        createQuestion("EUROPE1800H", "", 272, "");
        createQuestion("EUROPE1800H", "", 273, "");
        createQuestion("EUROPE1800H", "", 274, "");
        createQuestion("EUROPE1800H", "", 275, "");
        createQuestion("EUROPE1800H", "", 276, "");
        createQuestion("EUROPE1800H", "", 277, "");
        createQuestion("EUROPE1800H", "", 278, "");
        createQuestion("EUROPE1800H", "", 279, "");
        createQuestion("EUROPE1800H", "", 280, "");
        
        //EUROPE 1700 HISTORY POPULATION
        createQuestion("EUROPE1700H", "", 281, "");
        createQuestion("EUROPE1700H", "", 282, "");
        createQuestion("EUROPE1700H", "", 283, "");
        createQuestion("EUROPE1700H", "", 284, "");
        createQuestion("EUROPE1700H", "", 285, "");
        createQuestion("EUROPE1700H", "", 286, "");
        createQuestion("EUROPE1700H", "", 287, "");
        createQuestion("EUROPE1700H", "", 288, "");
        createQuestion("EUROPE1700H", "", 289, "");
        createQuestion("EUROPE1700H", "", 290, "");
        createQuestion("EUROPE1700H", "", 291, "");
        createQuestion("EUROPE1700H", "", 292, "");
        createQuestion("EUROPE1700H", "", 293, "");
        createQuestion("EUROPE1700H", "", 294, "");
        createQuestion("EUROPE1700H", "", 295, "");
        createQuestion("EUROPE1700H", "", 296, "");
        createQuestion("EUROPE1700H", "", 297, "");
        createQuestion("EUROPE1700H", "", 298, "");
        createQuestion("EUROPE1700H", "", 299, "");
        createQuestion("EUROPE1700H", "", 300, "");

        //EUROPE 1600 HISTORY POPULATION
        createQuestion("EUROPE1600H", "", 301, "");
        createQuestion("EUROPE1600H", "", 302, "");
        createQuestion("EUROPE1600H", "", 303, "");
        createQuestion("EUROPE1600H", "", 304, "");
        createQuestion("EUROPE1600H", "", 305, "");
        createQuestion("EUROPE1600H", "", 306, "");
        createQuestion("EUROPE1600H", "", 307, "");
        createQuestion("EUROPE1600H", "", 308, "");
        createQuestion("EUROPE1600H", "", 309, "");
        createQuestion("EUROPE1600H", "", 310, "");
        createQuestion("EUROPE1600H", "", 311, "");
        createQuestion("EUROPE1600H", "", 312, "");
        createQuestion("EUROPE1600H", "", 313, "");
        createQuestion("EUROPE1600H", "", 314, "");
        createQuestion("EUROPE1600H", "", 315, "");
        createQuestion("EUROPE1600H", "", 316, "");
        createQuestion("EUROPE1600H", "", 317, "");
        createQuestion("EUROPE1600H", "", 318, "");
        createQuestion("EUROPE1600H", "", 319, "");
        createQuestion("EUROPE1600H", "", 320, "");

        //EUROPE 1500 HISTORY POPULATION
        createQuestion("EUROPE1500H", "", 321, "");
        createQuestion("EUROPE1500H", "", 322, "");
        createQuestion("EUROPE1500H", "", 323, "");
        createQuestion("EUROPE1500H", "", 324, "");
        createQuestion("EUROPE1500H", "", 325, "");
        createQuestion("EUROPE1500H", "", 326, "");
        createQuestion("EUROPE1500H", "", 327, "");
        createQuestion("EUROPE1500H", "", 328, "");
        createQuestion("EUROPE1500H", "", 329, "");
        createQuestion("EUROPE1500H", "", 330, "");
        createQuestion("EUROPE1500H", "", 331, "");
        createQuestion("EUROPE1500H", "", 332, "");
        createQuestion("EUROPE1500H", "", 333, "");
        createQuestion("EUROPE1500H", "", 334, "");
        createQuestion("EUROPE1500H", "", 335, "");
        createQuestion("EUROPE1500H", "", 336, "");
        createQuestion("EUROPE1500H", "", 337, "");
        createQuestion("EUROPE1500H", "", 338, "");
        createQuestion("EUROPE1500H", "", 339, "");
        createQuestion("EUROPE1500H", "", 340, "");

        //EUROPE 1400 HISTORY POPULATION
        createQuestion("EUROPE1400H", "", 341, "");
        createQuestion("EUROPE1400H", "", 342, "");
        createQuestion("EUROPE1400H", "", 343, "");
        createQuestion("EUROPE1400H", "", 344, "");
        createQuestion("EUROPE1400H", "", 345, "");
        createQuestion("EUROPE1400H", "", 346, "");
        createQuestion("EUROPE1400H", "", 347, "");
        createQuestion("EUROPE1400H", "", 348, "");
        createQuestion("EUROPE1400H", "", 349, "");
        createQuestion("EUROPE1400H", "", 350, "");
        createQuestion("EUROPE1400H", "", 351, "");
        createQuestion("EUROPE1400H", "", 352, "");
        createQuestion("EUROPE1400H", "", 353, "");
        createQuestion("EUROPE1400H", "", 354, "");
        createQuestion("EUROPE1400H", "", 355, "");
        createQuestion("EUROPE1400H", "", 356, "");
        createQuestion("EUROPE1400H", "", 357, "");
        createQuestion("EUROPE1400H", "", 358, "");
        createQuestion("EUROPE1400H", "", 359, "");
        createQuestion("EUROPE1400H", "", 360, "");

        //EUROPE 1300 HISTORY POPULATION
        createQuestion("EUROPE1300H", "", 361, "");
        createQuestion("EUROPE1300H", "", 362, "");
        createQuestion("EUROPE1300H", "", 363, "");
        createQuestion("EUROPE1300H", "", 364, "");
        createQuestion("EUROPE1300H", "", 365, "");
        createQuestion("EUROPE1300H", "", 366, "");
        createQuestion("EUROPE1300H", "", 367, "");
        createQuestion("EUROPE1300H", "", 368, "");
        createQuestion("EUROPE1300H", "", 369, "");
        createQuestion("EUROPE1300H", "", 370, "");
        createQuestion("EUROPE1300H", "", 371, "");
        createQuestion("EUROPE1300H", "", 372, "");
        createQuestion("EUROPE1300H", "", 373, "");
        createQuestion("EUROPE1300H", "", 374, "");
        createQuestion("EUROPE1300H", "", 375, "");
        createQuestion("EUROPE1300H", "", 376, "");
        createQuestion("EUROPE1300H", "", 377, "");
        createQuestion("EUROPE1300H", "", 378, "");
        createQuestion("EUROPE1300H", "", 379, "");
        createQuestion("EUROPE1300H", "", 380, "");

        //ASIA 1900 HISTORY POPULATION
        createQuestion("ASIA1900H", "", 381, "");
        createQuestion("ASIA1900H", "", 382, "");
        createQuestion("ASIA1900H", "", 383, "");
        createQuestion("ASIA1900H", "", 384, "");
        createQuestion("ASIA1900H", "", 385, "");
        createQuestion("ASIA1900H", "", 386, "");
        createQuestion("ASIA1900H", "", 387, "");
        createQuestion("ASIA1900H", "", 388, "");
        createQuestion("ASIA1900H", "", 389, "");
        createQuestion("ASIA1900H", "", 390, "");
        createQuestion("ASIA1900H", "", 391, "");
        createQuestion("ASIA1900H", "", 392, "");
        createQuestion("ASIA1900H", "", 393, "");
        createQuestion("ASIA1900H", "", 394, "");
        createQuestion("ASIA1900H", "", 395, "");
        createQuestion("ASIA1900H", "", 396, "");
        createQuestion("ASIA1900H", "", 397, "");
        createQuestion("ASIA1900H", "", 398, "");
        createQuestion("ASIA1900H", "", 399, "");
        createQuestion("ASIA1900H", "", 400, "");

        //ASIA 1800 HISTORY POPULATION
        createQuestion("ASIA1800H", "", 401, "");
        createQuestion("ASIA1800H", "", 402, "");
        createQuestion("ASIA1800H", "", 403, "");
        createQuestion("ASIA1800H", "", 404, "");
        createQuestion("ASIA1800H", "", 405, "");
        createQuestion("ASIA1800H", "", 406, "");
        createQuestion("ASIA1800H", "", 407, "");
        createQuestion("ASIA1800H", "", 408, "");
        createQuestion("ASIA1800H", "", 409, "");
        createQuestion("ASIA1800H", "", 410, "");
        createQuestion("ASIA1800H", "", 411, "");
        createQuestion("ASIA1800H", "", 412, "");
        createQuestion("ASIA1800H", "", 413, "");
        createQuestion("ASIA1800H", "", 414, "");
        createQuestion("ASIA1800H", "", 415, "");
        createQuestion("ASIA1800H", "", 416, "");
        createQuestion("ASIA1800H", "", 417, "");
        createQuestion("ASIA1800H", "", 418, "");
        createQuestion("ASIA1800H", "", 419, "");
        createQuestion("ASIA1800H", "", 420, "");

        //ASIA 1700 HISTORY POPULATION
        createQuestion("ASIA1700H", "", 421, "");
        createQuestion("ASIA1700H", "", 422, "");
        createQuestion("ASIA1700H", "", 423, "");
        createQuestion("ASIA1700H", "", 424, "");
        createQuestion("ASIA1700H", "", 425, "");
        createQuestion("ASIA1700H", "", 426, "");
        createQuestion("ASIA1700H", "", 427, "");
        createQuestion("ASIA1700H", "", 428, "");
        createQuestion("ASIA1700H", "", 429, "");
        createQuestion("ASIA1700H", "", 430, "");
        createQuestion("ASIA1700H", "", 431, "");
        createQuestion("ASIA1700H", "", 432, "");
        createQuestion("ASIA1700H", "", 433, "");
        createQuestion("ASIA1700H", "", 434, "");
        createQuestion("ASIA1700H", "", 435, "");
        createQuestion("ASIA1700H", "", 436, "");
        createQuestion("ASIA1700H", "", 437, "");
        createQuestion("ASIA1700H", "", 438, "");
        createQuestion("ASIA1700H", "", 439, "");
        createQuestion("ASIA1700H", "", 440, "");

        //ASIA 1600 HISTORY POPULATION
        createQuestion("ASIA1600H", "", 441, "");
        createQuestion("ASIA1600H", "", 442, "");
        createQuestion("ASIA1600H", "", 443, "");
        createQuestion("ASIA1600H", "", 444, "");
        createQuestion("ASIA1600H", "", 445, "");
        createQuestion("ASIA1600H", "", 446, "");
        createQuestion("ASIA1600H", "", 447, "");
        createQuestion("ASIA1600H", "", 448, "");
        createQuestion("ASIA1600H", "", 449, "");
        createQuestion("ASIA1600H", "", 450, "");
        createQuestion("ASIA1600H", "", 451, "");
        createQuestion("ASIA1600H", "", 452, "");
        createQuestion("ASIA1600H", "", 453, "");
        createQuestion("ASIA1600H", "", 454, "");
        createQuestion("ASIA1600H", "", 455, "");
        createQuestion("ASIA1600H", "", 456, "");
        createQuestion("ASIA1600H", "", 457, "");
        createQuestion("ASIA1600H", "", 458, "");
        createQuestion("ASIA1600H", "", 459, "");
        createQuestion("ASIA1600H", "", 460, "");

        //ASIA 1500 HISTORY POPULATION
        createQuestion("ASIA1500H", "", 461, "");
        createQuestion("ASIA1500H", "", 462, "");
        createQuestion("ASIA1500H", "", 463, "");
        createQuestion("ASIA1500H", "", 464, "");
        createQuestion("ASIA1500H", "", 465, "");
        createQuestion("ASIA1500H", "", 466, "");
        createQuestion("ASIA1500H", "", 467, "");
        createQuestion("ASIA1500H", "", 468, "");
        createQuestion("ASIA1500H", "", 469, "");
        createQuestion("ASIA1500H", "", 470, "");
        createQuestion("ASIA1500H", "", 471, "");
        createQuestion("ASIA1500H", "", 472, "");
        createQuestion("ASIA1500H", "", 473, "");
        createQuestion("ASIA1500H", "", 474, "");
        createQuestion("ASIA1500H", "", 475, "");
        createQuestion("ASIA1500H", "", 476, "");
        createQuestion("ASIA1500H", "", 477, "");
        createQuestion("ASIA1500H", "", 478, "");
        createQuestion("ASIA1500H", "", 479, "");
        createQuestion("ASIA1500H", "", 480, "");

        //ASIA 1400 HISTORY POPULATION
        createQuestion("ASIA1400H", "", 481, "");
        createQuestion("ASIA1400H", "", 482, "");
        createQuestion("ASIA1400H", "", 483, "");
        createQuestion("ASIA1400H", "", 484, "");
        createQuestion("ASIA1400H", "", 485, "");
        createQuestion("ASIA1400H", "", 486, "");
        createQuestion("ASIA1400H", "", 487, "");
        createQuestion("ASIA1400H", "", 488, "");
        createQuestion("ASIA1400H", "", 489, "");
        createQuestion("ASIA1400H", "", 490, "");
        createQuestion("ASIA1400H", "", 491, "");
        createQuestion("ASIA1400H", "", 492, "");
        createQuestion("ASIA1400H", "", 493, "");
        createQuestion("ASIA1400H", "", 494, "");
        createQuestion("ASIA1400H", "", 495, "");
        createQuestion("ASIA1400H", "", 496, "");
        createQuestion("ASIA1400H", "", 497, "");
        createQuestion("ASIA1400H", "", 498, "");
        createQuestion("ASIA1400H", "", 499, "");
        createQuestion("ASIA1400H", "", 500, "");

        //ASIA 1300 HISTORY POPULATION
        createQuestion("ASIA1300H", "", 501, "");
        createQuestion("ASIA1300H", "", 502, "");
        createQuestion("ASIA1300H", "", 503, "");
        createQuestion("ASIA1300H", "", 504, "");
        createQuestion("ASIA1300H", "", 505, "");
        createQuestion("ASIA1300H", "", 506, "");
        createQuestion("ASIA1300H", "", 507, "");
        createQuestion("ASIA1300H", "", 508, "");
        createQuestion("ASIA1300H", "", 509, "");
        createQuestion("ASIA1300H", "", 510, "");
        createQuestion("ASIA1300H", "", 511, "");
        createQuestion("ASIA1300H", "", 512, "");
        createQuestion("ASIA1300H", "", 513, "");
        createQuestion("ASIA1300H", "", 514, "");
        createQuestion("ASIA1300H", "", 515, "");
        createQuestion("ASIA1300H", "", 516, "");
        createQuestion("ASIA1300H", "", 517, "");
        createQuestion("ASIA1300H", "", 518, "");
        createQuestion("ASIA1300H", "", 519, "");
        createQuestion("ASIA1300H", "", 520, "");

        //MINECRAFT EASTER EGG POPULATION
        createQuestion("MINECRAFT", "", 521, "");
        createQuestion("MINECRAFT", "", 522, "");
        createQuestion("MINECRAFT", "", 523, "");
        createQuestion("MINECRAFT", "", 524, "");
        createQuestion("MINECRAFT", "", 525, "");
        createQuestion("MINECRAFT", "", 526, "");
        createQuestion("MINECRAFT", "", 527, "");
        createQuestion("MINECRAFT", "", 528, "");
        createQuestion("MINECRAFT", "", 529, "");
        createQuestion("MINECRAFT", "", 530, "");
        createQuestion("MINECRAFT", "", 531, "");
        createQuestion("MINECRAFT", "", 532, "");
        createQuestion("MINECRAFT", "", 533, "");
        createQuestion("MINECRAFT", "", 534, "");
        createQuestion("MINECRAFT", "", 535, "");
        createQuestion("MINECRAFT", "", 536, "");
        createQuestion("MINECRAFT", "", 537, "");
        createQuestion("MINECRAFT", "", 538, "");
        createQuestion("MINECRAFT", "", 539, "");
        createQuestion("MINECRAFT", "", 540, "");
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

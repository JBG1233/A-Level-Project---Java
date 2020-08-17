package com.questionnaire.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


@Slf4j
@Service
public class RandomNumberGenerator {

    public Set<Integer> generate(int endRange) {

        Random rand = new Random();

        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 7) {
            int randomNum = rand.nextInt(endRange) + 1;
            if (numbers.contains(randomNum)) {
            } else {
                numbers.add(randomNum);
            }
        }

        return numbers;

    }
}

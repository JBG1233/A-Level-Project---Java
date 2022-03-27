package com.questionnaire.service.Populate;

import com.questionnaire.domain.School;
import com.questionnaire.repositories.SchoolRepository;
import com.questionnaire.service.Generation.UserId;
import com.questionnaire.service.Generation.UserId;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
@Slf4j
public class PopulateSchools {

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    UserId userId = new UserId();


    @PostConstruct
    public void createSchools() {

        createSchool("RGS");
        createSchool("BHS");

    }

    public void createSchool (String schoolName) {
        School school = new School();
        school.setName(schoolName);
        school.setSchoolID(UserId.getUserId(10));
        //schoolRepository.save(school);
    }
}

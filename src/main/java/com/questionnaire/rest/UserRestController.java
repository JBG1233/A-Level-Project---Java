package com.questionnaire.rest;

import com.questionnaire.domain.User;
import com.questionnaire.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Slf4j
@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "http://localhost:3000")
public class UserRestController {
    @Autowired
    private UserRepository userRepository;


    @RequestMapping(method = RequestMethod.POST, value = "/Register")
    public User register (@Valid @RequestBody User user) {
            userRepository.save(user);
            return user;
    }
}

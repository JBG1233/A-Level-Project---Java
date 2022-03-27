package com.questionnaire.service.LoginAndRegister;

import com.questionnaire.domain.User;
import com.questionnaire.repositories.ScoresRepository;
import com.questionnaire.repositories.UserRepository;
import com.questionnaire.service.Generation.UserId;
import com.questionnaire.service.Exceptions.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class UserLogin {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public ScoresRepository scoresRepository;

    public User login(User user) throws BadRequestException {
        return checkForUsername(user);
    }

    public User checkForUsername(User user) throws BadRequestException {
        if (userRepository.existsByUsernameIsIn(user.getUsername())) {
            return checkForPassword(user);
        } else {
            throw new BadRequestException("Username not found!");
        }
    }

    public User checkForPassword(User user) throws BadRequestException {
        if (BCrypt.checkpw(user.getPassword(), userRepository.findByUsername(user.getUsername()).password)) {
            return userRepository.findByUsername(user.getUsername());
        } else {
            throw new BadRequestException("Password not found!");
        }
    }
}

package com.questionnaire.service.Contact;

import com.questionnaire.domain.Contact;
import com.questionnaire.domain.User;
import com.questionnaire.repositories.ContactRepository;
import com.questionnaire.repositories.UserRepository;
import com.questionnaire.service.Exceptions.BadRequestException;
import com.questionnaire.service.Exceptions.ForbiddenException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
@Service
public class ContactMe {

    @Autowired
    ContactRepository contactRepository;

    @Autowired
    UserRepository userRepository;

    public void illegalContact (Contact newContact, String username) throws ForbiddenException, BadRequestException {
        log.info("{}", newContact.firstName);
        if (!checkForIllegalCharsContact(newContact.firstName)) {
            throw new ForbiddenException("No illegal chars allowed");
        } else {
            if (!checkForIllegalCharsContact(newContact.lastName)) {
                throw new ForbiddenException("No illegal chars allowed");
            } else {
                contactTimeChecker(newContact, username);
            }
        }
    }

    public boolean checkForIllegalCharsContact (String toExamine) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]");
        Matcher matcher = pattern.matcher(toExamine);
        return matcher.find();
    }

    public void createNewContact (Contact newContact) {
        Contact contact = new Contact();
        contact.setFirstName(newContact.firstName);
        contact.setLastName(newContact.lastName);
        contact.setMessage(newContact.message);
        contactRepository.save(contact);
    }

    public void contactTimeChecker(Contact newContact, String username) throws BadRequestException, ForbiddenException {
        User user = userRepository.findByUsername(username);
        if (System.currentTimeMillis() >= user.getTime()) {
            userRepository.deleteByUsernameAndPassword(user.getUsername(), user.getPassword());
            User newUser = new User();
            newUser.setUsername(user.getUsername());
            newUser.setPassword(user.getPassword());
            newUser.setAccessToken(user.getAccessToken());
            newUser.setTime(System.currentTimeMillis() + 43200000);
            userRepository.save(newUser);
            createNewContact(newContact);
        } else {
            throw new BadRequestException("Not allowed another message for 12 hours!");
        }
    }


}

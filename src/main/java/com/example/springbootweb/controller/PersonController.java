package com.example.springbootweb.controller;

import com.example.springbootweb.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/clients")
    public Person getPerson() {
        Person person = new Person();
        person.setFirstName("Alice");
        person.setLastName("Johnson");
        return person;
    }
}


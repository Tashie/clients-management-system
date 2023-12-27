package com.example.springbootweb.controller;

import com.example.springbootweb.model.Person;
import io.micrometer.core.annotation.Counted;
import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Counted("person_get_clients_data_count")
    @Timed("person_get_clients_data_time")
    @GetMapping("/clients")
    public Person getPerson() {
        Person person = new Person();
        person.setFirstName("Alice");
        person.setLastName("Johnson");
        return person;
    }
}


package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/persons")
public class PersonController {



    private PersonService personService;

    @GetMapping(value= "/all")
    public List<Person> getPersons()
    {
        return personService.getPersons();
    }
}

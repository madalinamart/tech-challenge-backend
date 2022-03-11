package com.example.demo.person;

import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
//SERVICE LAYER
@Service
@Repository

public class PersonService {
    @Autowired
    private static PersonRepository personRepository;

    public Person saveUser(Person person) {
        return personRepository.save(person);
    }

    public List<Person> saveUsers(List<Person> persons) {
        return personRepository.saveAll(persons);
    }

    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    public Person getPersonById(Long Id) {
        return personRepository.findById(Id).orElse(null);
    }

    public Person getPersonByName(String name) {
        return personRepository.findByName(name);
    }

    public String deletePerson(Long Id) {
        personRepository.deleteById(Id);
        return "Person with id <" + Id + "> has been removed.";
    }
}

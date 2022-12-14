package com.example.demojpa.service;

import com.example.demojpa.models.Person;
import com.example.demojpa.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person getById(Long id) {
        Optional<Person> person = personRepository.findById(id);
        return person.orElse(null);
    }
}

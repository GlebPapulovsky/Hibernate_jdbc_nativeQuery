package com.example.demo.service;

import com.example.demo.model.persons.Persons;
import com.example.demo.model.repository.MyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MyService {
    private final MyRepository repository;
    public MyService(MyRepository repository){
        this.repository = repository;
    }

    public List<String> getPersonsByCity(String city) {
        List<Persons>list = repository.getPersonByCity(city);
        List<String> result = new ArrayList<>();
        for (Persons persons : list) {
            result.add(persons.getName());
        }
        return result;

    }
    public List<Persons> getPersonsByAge(int age) {
        List<Persons>list = repository.getPersonByAge(age);

        list.sort((O1,O2)-> {
            return O1.getAge() - O2.getAge();
        });

        return list;

    }
    public Optional<Persons> getPersonsByNameAndSurname(String name, String surname)  {
        return repository.getPersonByNameAndSurname(name,surname);
    }
}

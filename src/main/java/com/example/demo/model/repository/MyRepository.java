package com.example.demo.model.repository;

import com.example.demo.model.persons.Persons;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//repository
@Repository
public class MyRepository {
    @PersistenceContext
    private final EntityManager entityManager;
    private final JpaRepositoryInterface repositoryInterface;


    public MyRepository(EntityManager entityManager, JpaRepositoryInterface repositoryInterface) {
        this.entityManager = entityManager;
        this.repositoryInterface = repositoryInterface;

    }


    public List<Persons> getPersonByCity(String city) {
        return repositoryInterface.findByCityOfLiving(city);

    }

    public List<Persons> getPersonByAge(int age) {
        return repositoryInterface.findByAgeLessThanEqual(age);

    }

    public Optional<Persons> getPersonByNameAndSurname(String name, String surname) {
        return repositoryInterface.findByNameAndSurname(name, surname);

    }


}

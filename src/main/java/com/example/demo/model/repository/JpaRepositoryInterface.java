package com.example.demo.model.repository;

import com.example.demo.model.persons.Persons;
import com.example.demo.model.persons.PersonsId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface JpaRepositoryInterface extends JpaRepository<Persons, PersonsId> {
    //поиск по имени
    List<Persons> findByCityOfLiving(String cityOfLiving);

    //поиск тех,у кого возраст меньше age
    List<Persons> findByAgeLessThanEqual(int age);

    //поиск по имени и фамилии
    Optional<Persons> findByNameAndSurname(String name, String surname);


}

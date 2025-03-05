package com.example.demo.model.repository;

import com.example.demo.model.persons.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MyRepositoryInterface extends JpaRepository<Persons, Integer> {

    @Query(
            nativeQuery = true,
            value = "select p.name from myschema.persons p where p.city_of_living = :city_of_living")
    List<String> getPersonByCity(@Param("city_of_living") String city);


}

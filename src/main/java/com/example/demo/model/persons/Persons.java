package com.example.demo.model.persons;

import jakarta.persistence.*;

@Entity
@IdClass(PersonsId.class)
@Table(name = "persons", schema = "myschema")
public class Persons {
    @Id
    @Column(name = "age", nullable = false, length = 50)
    private int age;
    @Id
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Id
    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "city_of_living", length = 50)
    private String cityOfLiving;

    @Column(name = "phone_number", length = 50)
    private String phoneNumber;

    public Persons() {
    }

    public String getCityOfLiving() {
        return cityOfLiving;
    }

    public void setCityOfLiving(String cityOfLiving) {
        this.cityOfLiving = cityOfLiving;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}

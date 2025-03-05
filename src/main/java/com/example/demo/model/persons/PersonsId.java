package com.example.demo.model.persons;

import java.io.Serializable;
import java.util.Objects;

public class PersonsId implements Serializable {
    private int age;

    private String name;

    private String surname;

    public PersonsId(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public PersonsId() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonsId)) return false;
        PersonsId that = (PersonsId) o;
        return age == that.age && name.equals(that.name) && surname.equals(that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, surname);
    }

}

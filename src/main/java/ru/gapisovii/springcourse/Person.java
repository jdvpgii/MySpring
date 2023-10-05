package ru.gapisovii.springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Person {
    private Pet pet;

    @Value("${person.name}")
    private String name;

    @Value("${person.surname}")
    private String surname;

    @Value("${person.age}")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("Person: set pet");
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hey, come here");
        pet.voice();
    }
}

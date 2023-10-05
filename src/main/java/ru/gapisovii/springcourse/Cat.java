package ru.gapisovii.springcourse;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    private String name;
    private int age;

    public Cat() {
        System.out.println("Cat empty constructor");
    }

    public void nameMethod() {
        System.out.println("its init method");
    }

    public void secondMethod() {
        System.out.println("destroy method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("meow");
    }
}

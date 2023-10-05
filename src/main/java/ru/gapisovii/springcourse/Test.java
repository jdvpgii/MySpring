package ru.gapisovii.springcourse;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Pet cat = context.getBean("catBean", Pet.class);
        Person person = context.getBean("person", Person.class);

        cat.voice();
        person.callPet();
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}

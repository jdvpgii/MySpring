package ru.gapisovii.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@ComponentScan
@PropertySource("classpath:personInfo.properties")
public class MyConfig {

    @Bean
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person person() {
        return new Person(catBean());
    }
}

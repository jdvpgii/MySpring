package ru.gapisovii.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);

        Library library = context.getBean("library", Library.class);

        library.getBook();

        context.close();
    }
}

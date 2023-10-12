package ru.gapisovii.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("Take a book from SchoolLibrary");
    }
}

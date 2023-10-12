package ru.gapisovii.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{
//    @Override
//    public void getBook() {
//        System.out.println("Take a book from UniLibrary");
//    }


    public void getBook() {
        System.out.println("Take a book from UniLibrary");
    }

    public String returnBook() {
        System.out.println("Return a book to UniLibrary");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("Take a magazine from UniLibrary");
    }

    public void returnMagazine(){}

    public void addBook(){}


    public void addMagazine(){}
}

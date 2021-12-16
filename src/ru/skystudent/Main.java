package ru.skystudent;

public class Main {

    public static void main(String[] args) {
        Author alexeyVasilev = new Author("Алексей", "Васильев");
        Author kenKouzen = new Author("Кен", "Коузен");
        Book javaForAll = new Book("Java для всех", alexeyVasilev, 2019);
        Book modernJava = new Book("Современный Java", kenKouzen, 2019);
        modernJava.setYearOfPublishing(2017);
        System.out.println(modernJava.getAuthor());
        System.out.println(modernJava.getName());
        System.out.println(javaForAll.getName());
        System.out.println(javaForAll.getAuthor());
        System.out.println(modernJava.getYearOfPublishing());
    }
}

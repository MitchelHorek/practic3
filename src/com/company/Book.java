package com.company;

public class Book {
    private int age;
    private String author;
    private String name;
    public Book(int age, String author, String name){
        this.age = age;
        this.author = author;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void ShowBook() {
        System.out.println("Aвтор: " + author);
        System.out.println("Название: " + name);
        System.out.println("Год написания: " + age);
    }
}

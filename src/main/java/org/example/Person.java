package org.example;

public class Person {
    public String name;
    public int age;
    protected String address;

    public Person() {
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "1 Wanderlust Blvd.";
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }


    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

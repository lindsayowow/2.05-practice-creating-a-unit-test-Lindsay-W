package org.example;

public class Student extends Person{
    public int studentId;

    public Student() {
        super("", 6, "");
    }

    public Student(String name, int age, int studentId) {
        super( name, age);
        this.studentId = studentId;
        this.address = "100 Hidey-Hole Lane";
    }

    public Student(String name, int age, String address, int studentId) {
        super( name, age, address);
        this.studentId = studentId;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old. My student ID is " + studentId + ".");
    }

}

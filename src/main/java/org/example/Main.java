package org.example;

import java.util.List;
import java.util.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 30;
        person1.address = "123 Main St.";
        person1.printInfo();

        Person person2 = new Person("Janet", 31, "10914 Ridge Forest Dr.");
        Student student2 = new Student("Chrissy", 10, "43 May Valley Dr,", 5309);

        Student student1 = new Student();
        student1.name = "Bob";
        student1.age = 20;
        student1.studentId = 12345;
        student1.address = "456 Elm St.";
        student1.printInfo();

        Teacher teacher1 = new Teacher();
        teacher1.name = "Charlie";
        teacher1.age = 40;
        teacher1.teacherId = 67890;
        teacher1.printInfo();

        Person person3 = new Person("Jack", 32, "108 Laredo Ave.");
        person3.greet();

        Student student3 = new Student("Mr. Roper", 22, "4 Maid Marion Ct.", 5715);
        student3.greet();

        Teacher teacher2 = new Teacher();
        teacher2.name = "Cindy";
        teacher2.age = 41;
        teacher2.address = "420 Lakeshore Dr.";
        teacher2.teacherId = 58008;
        teacher2.greet();

        Person person4 = new Person("Sheri", 33);
        Student student4 = new Student("Gayle", 23, 54321);
        Teacher teacher3 = new Teacher("Leslie", 42, 9876);

        List<Person> people = new ArrayList<>();
        people.add(person2);
        people.add(student2);
        people.add(teacher3);

        printGreeting(person4);
        printGreeting(student4);
        printGreeting(teacher1);

        for (Person p : people) {
            p.greet();
        }

        List<Object> stuff = new ArrayList<>();

        stuff.add("Hello");
        stuff.add(1);
        stuff.add(3.14);
        stuff.add(person1);

        for (Object obj : stuff) {
            System.out.println(obj);
        }


    }

    public static void printGreeting(Person p) {
        p.greet();
    }

}
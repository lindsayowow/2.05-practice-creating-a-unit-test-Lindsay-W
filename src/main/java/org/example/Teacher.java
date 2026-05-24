package org.example;

public class Teacher extends Person{
    public int teacherId;

    public Teacher() {
        super("", 0, "");
        this.teacherId = 0;
    }

    public Teacher(String name, int age, int teacherId) {
        super(name, age);
        this.teacherId = teacherId;
        this.address = "1000 Wherever Pl.";
    }


}

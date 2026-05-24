package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTests {

    @Test
    public void testCreateStudent(){
        Student student = new Student();
        assertEquals("",student.name);
        assertEquals(6,student.age);
        assertEquals("",student.address);
        assertEquals(0,student.studentId);
    }

    @Test
    public void testCreateStudentWith3Args(){
        Student student = new Student("Jenny",4,12345);
        assertEquals("Jenny",student.name);
        assertEquals(4,student.age);
        assertEquals("100 Hidey-Hole Lane",student.address);
        assertEquals(12345,student.studentId);
    }

    @Test
    public void testCreateStudentWith4Args(){
        Student student = new Student("Sheri",40, "108 Forder Lane",54321);
        assertEquals("Sheri",student.name);
        assertEquals(40,student.age);
        assertEquals("108 Forder Lane",student.address);
        assertEquals(54321,student.studentId);
    }

    @Test
    public void testGettersAndSetters(){
        Student student = new Student("Manuel", 25, "28 Smoke Tree Dr", 87);
        student.setStudentId(111);
        assertEquals(111, student.getStudentId());
        student.setStudentId(2147483647);
        assertEquals(2147483647, student.getStudentId());
            }

}



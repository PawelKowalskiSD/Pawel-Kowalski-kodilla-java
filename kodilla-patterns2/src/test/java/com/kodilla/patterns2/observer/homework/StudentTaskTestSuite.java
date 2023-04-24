package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTaskTestSuite {

    @Test
    public void testUpdate() {
        //Given
        StudentTask javaCourse = new JavaCourse();
        StudentTask javaScriptCourse = new JavaScriptCourse();
        StudentTask pythonCourse = new PythonCourse();
        Mentor janKovalski = new Mentor("Jan Kovalski");
        Mentor romanSmith = new Mentor("Roman Smith");
        Mentor kamilAlvaro = new Mentor("Kamil Alvaro");
        javaCourse.registerTaskObserver(janKovalski);
        pythonCourse.registerTaskObserver(romanSmith);
        javaScriptCourse.registerTaskObserver(janKovalski);
        javaScriptCourse.registerTaskObserver(romanSmith);
        javaCourse.registerTaskObserver(kamilAlvaro);

        //When
        javaCourse.addTask("First Task");
        javaCourse.addTask("Second Task");
        javaScriptCourse.addTask("First Task introduce JS");
        pythonCourse.addTask("Learn python simple task");
        pythonCourse.addTask("Second  task");
        pythonCourse.addTask("Add dependency task");

        //Then
        assertEquals(3, janKovalski.getUpdateCount());
        assertEquals(4, romanSmith.getUpdateCount());
        assertEquals(2, kamilAlvaro.getUpdateCount());
    }

}
package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Mark", new Teacher("mr.Kowalski")));
        studentList.add(new Student("Tom", null));
        studentList.add(new Student("Bill", new Teacher("mr.Nagamashi")));
        studentList.add(new Student("Ben", null));

        for (Student studentTeacherPairs : studentList) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(studentTeacherPairs.getTeacher());
            Teacher teacher = optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println("Uczeń: " + studentTeacherPairs.getStudentName() + ", nauczyciel: " + teacher.getTeacherName());
        }
    }
}
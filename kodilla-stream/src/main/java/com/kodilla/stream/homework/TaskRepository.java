package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("do task 6.1", LocalDate.of(2020, 7, 22), LocalDate.of(2020, 7, 22)));
        tasks.add(new Task("do task 6.2", LocalDate.of(2020, 7, 22), LocalDate.of(2020, 7, 23)));
        tasks.add(new Task("do task 6.3", LocalDate.of(2020, 7, 22), LocalDate.of(2020, 7, 24)));
        tasks.add(new Task("do task 6.4", LocalDate.of(2020, 7, 23), LocalDate.of(2020, 7, 25)));
        tasks.add(new Task("do task 6.5", LocalDate.of(2020, 7, 23), LocalDate.of(2020, 7, 26)));
        tasks.add(new Task("do task 6.6", LocalDate.of(2020, 7, 23), LocalDate.of(2020, 7, 28)));
        return tasks;
    }
}
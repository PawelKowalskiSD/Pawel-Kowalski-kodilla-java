package com.kodilla.spring.portfolio;

public final class Board {

    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList DoneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        DoneList = doneList;
    }
}

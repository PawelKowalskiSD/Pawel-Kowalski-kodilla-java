package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {

    private List<String> tasks;

    public TaskList(final List<String> tasks) {
        this.tasks = new ArrayList<>();
    }
}

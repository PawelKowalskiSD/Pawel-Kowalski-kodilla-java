package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";

    public static final boolean DONE_TASK = true;

    public Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case DRIVING_TASK -> new DrivingTask("Relaxing by the water", "lake", "car");
            case PAINTING_TASK -> new PaintingTask("Painting", "gray", "walls");
            case SHOPPING_TASK -> new ShoppingTask("Shopping Gallery", "t-shirts", 2.0);
            default -> null;
        };
    }

    public Task checkTasks(Task task) {
        if (DONE_TASK == task.isTaskExecuted()) {
            System.out.println("You already did");
        } else
            System.out.println("You have to do it");
        return task;
    }
}

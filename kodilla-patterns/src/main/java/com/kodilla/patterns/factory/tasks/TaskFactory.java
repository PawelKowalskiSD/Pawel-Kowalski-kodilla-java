package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    private static final String DRIVING_TASK = "DRIVING_TASK";
    private static final String PAINTING_TASK = "PAINTING_TASK";
    private static final String SHOPPING_TASK = "SHOPPING_TASK";

    public Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case DRIVING_TASK -> new DrivingTask("", "", "");
            case PAINTING_TASK -> new PaintingTask("", "", "");
            case SHOPPING_TASK -> new ShoppingTask("", "", 2.0);
            default -> null;
        };
    }
}

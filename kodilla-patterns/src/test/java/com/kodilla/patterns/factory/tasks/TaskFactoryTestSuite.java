package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Task factory test suite")
public class TaskFactoryTestSuite {

    @Test
    @DisplayName("Test factory shopping task")
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        Task result = taskFactory.checkTasks(shoppingTask);
        boolean isDone = shoppingTask.isTaskExecuted();

        //Then
        System.out.println(result);
        assertTrue(isDone);
        assertEquals("Shopping Gallery", shoppingTask.getTaskName());
        assertEquals("t-shirts " + 2.0, shoppingTask.executeTask());
    }

    @Test
    @DisplayName("Test factory painting task")
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        Task result = taskFactory.checkTasks(paintingTask);
        boolean isDone = paintingTask.isTaskExecuted();

        //Then
        System.out.println(result);
        assertFalse(isDone);
        assertEquals("Painting", paintingTask.getTaskName());
        assertEquals("walls gray", paintingTask.executeTask());
    }

    @Test
    @DisplayName("Test factory driving task")
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        Task result = taskFactory.checkTasks(drivingTask);
        boolean isDone = drivingTask.isTaskExecuted();

        //Then
        System.out.println(result);
        assertFalse(isDone);
        assertEquals("Relaxing by the water", drivingTask.getTaskName());
        assertEquals("lake car", drivingTask.executeTask());
    }


}

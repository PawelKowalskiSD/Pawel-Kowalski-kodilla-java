package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayName("Board test suite")
public class BoardTestSuite {

    @Autowired
    private Board board;

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("\n Preparing to execute test #" + testCounter);
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Nested
    @DisplayName("Test Task add")
    class testTaskAdd {

        @Test
        @DisplayName("Test add task to do list")
        void testAddTaskToDoList() {
            //Given

            //When
            board.getToDoList().getTasks().add("homework");
            String result = board.getToDoList().getTasks().get(0);

            //Then
            assertEquals(1, board.getToDoList().getTasks().size());
            assertEquals("homework", result);
            assertFalse(board.getToDoList().getTasks().isEmpty());
        }

        @Test
        @DisplayName("Test add task in progress list")
        void testAddTaskInProgressList() {
            //Given

            //When
            board.getInProgressList().getTasks().add("Create new website");
            String result = board.getInProgressList().getTasks().get(0);

            //Then
            assertEquals(1, board.getInProgressList().getTasks().size());
            assertEquals("Create new website", result);
            assertFalse(board.getInProgressList().getTasks().isEmpty());
        }

        @Test
        @DisplayName("Test add task done list")
        void testAddTaskDoneList() {
            //Given

            //When
            board.getDoneList().getTasks().add("Business meeting");
            String result = board.getDoneList().getTasks().get(0);

            //Then
            assertEquals(1, board.getDoneList().getTasks().size());
            assertEquals("Business meeting", result);
            assertFalse(board.getDoneList().getTasks().isEmpty());
        }
    }
}

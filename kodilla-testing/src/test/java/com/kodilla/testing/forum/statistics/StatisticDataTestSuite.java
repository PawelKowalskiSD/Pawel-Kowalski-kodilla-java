package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistic.StatisticalData;
import com.kodilla.testing.forum.statistic.Statistics;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("Statistic Data Test Suite")
public class StatisticDataTestSuite {

    private static int testCounter = 0;

    @Mock
    private Statistics statisticsMock;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Nested
    @DisplayName("Test number of posts")
    class TestNumberOfPosts {
        @Test
        void testWhenNumberOfPostsEquals0() {
            //Given
            StatisticalData statisticalData = new StatisticalData(statisticsMock);
            List<String> posts = generateListOfPosts(0);
            List<String> comments = generateListOfComments(0);
            List<String> users = generateListOfUsers(10);
            when(statisticsMock.postsCount()).thenReturn(posts.size());
            when(statisticsMock.commentsCount()).thenReturn(comments.size());
            when(statisticsMock.userNames()).thenReturn(users);

            //When
            statisticalData.calculateAdvStatistics(statisticsMock);
            double result = statisticalData.getAverageNumberOfPostsPerUser();
            statisticalData.showStatistics();

            //Then
            assertEquals(0.0, result);
        }

        @Test
        void testWhenNumberOfPostsEquals1000() {
            //Given
            StatisticalData statisticalData = new StatisticalData(statisticsMock);
            List<String> posts = generateListOfPosts(50000);
            List<String> comments = generateListOfPosts(250000);
            List<String> users = generateListOfPosts(50);
            when(statisticsMock.postsCount()).thenReturn(posts.size());
            when(statisticsMock.commentsCount()).thenReturn(comments.size());
            when(statisticsMock.userNames()).thenReturn(users);

            //When
            statisticalData.calculateAdvStatistics(statisticsMock);
            double result = statisticalData.getAverageNumberOfPostsPerUser();
            statisticalData.showStatistics();

            //Then
            assertEquals(1000, result);
        }
    }

    @Nested
    @DisplayName("Test number of users")
    class TestNumberOfUsers {
        @Test
        void testWhenNumberOfUserEquals0() {
            //Given
            StatisticalData statisticalData = new StatisticalData(statisticsMock);
            List<String> users = generateListOfUsers(0);
            List<String> posts = generateListOfPosts(0);
            List<String> comments = generateListOfComments(0);
            when(statisticsMock.userNames()).thenReturn(users);
            when(statisticsMock.postsCount()).thenReturn(posts.size());
            when(statisticsMock.commentsCount()).thenReturn(comments.size());

            //When
            statisticalData.calculateAdvStatistics(statisticsMock);
            double result = statisticalData.getNumberOfUsers();
            statisticalData.showStatistics();

            //Then
            assertEquals(0, result);
        }

        @Test
        void testWhenNumberOfUsersEquals100() {
            //Given
            StatisticalData statisticalData = new StatisticalData(statisticsMock);
            List<String> users = generateListOfUsers(100);
            List<String> posts = generateListOfPosts(100);
            List<String> comments = generateListOfComments(100);
            when(statisticsMock.userNames()).thenReturn(users);
            when(statisticsMock.postsCount()).thenReturn(posts.size());
            when(statisticsMock.commentsCount()).thenReturn(comments.size());

            //When
            statisticalData.calculateAdvStatistics(statisticsMock);
            double result = statisticalData.getNumberOfUsers();
            statisticalData.showStatistics();

            //Then
            assertEquals(100, result);
        }
    }

    @Nested
    @DisplayName("Test average number of comments")
    class TestAverageNumberOfComments {

        @Test
        void testWhenNumberOfCommentsEquals0() {
            //Given
            StatisticalData statisticalData = new StatisticalData(statisticsMock);
            List<String> comments = generateListOfComments(0);
            List<String> users = generateListOfUsers(100);
            List<String> posts = generateListOfPosts(10);
            when(statisticsMock.commentsCount()).thenReturn(comments.size());
            when(statisticsMock.userNames()).thenReturn(users);
            when(statisticsMock.postsCount()).thenReturn(posts.size());

            //When
            statisticalData.calculateAdvStatistics(statisticsMock);
            double result = statisticalData.getAverageNumberOfCommentsPerUser();
            statisticalData.showStatistics();

            //Then
            assertEquals(0.0, result);
        }

        @Test
        void testWhenNumberOfCommentsIsSmallerThanNumberOfPosts() {
            //Given
            StatisticalData statisticalData = new StatisticalData(statisticsMock);

            List<String> comments = generateListOfComments(700);
            List<String> posts = generateListOfPosts(900);
            List<String> users = generateListOfPosts(20);
            when(statisticsMock.commentsCount()).thenReturn(comments.size());
            when(statisticsMock.postsCount()).thenReturn(posts.size());
            when(statisticsMock.userNames()).thenReturn(users);

            //When
            statisticalData.calculateAdvStatistics(statisticsMock);
            boolean result = statisticalData.getAverageNumberOfCommentsPerUser() < statisticalData.getAverageNumberOfPostsPerUser();
            statisticalData.showStatistics();

            //Then
            assertTrue(result);
        }

        @Test
        void testWhenNumberOfCommentsIsLargerThanNumberOfPost() {
            //Given
            StatisticalData statisticalData = new StatisticalData(statisticsMock);
            List<String> comments = generateListOfComments(2000);
            List<String> posts = generateListOfPosts(500);
            List<String> users = generateListOfUsers(70);
            when(statisticsMock.commentsCount()).thenReturn(comments.size());
            when(statisticsMock.postsCount()).thenReturn(posts.size());
            when(statisticsMock.userNames()).thenReturn(users);

            //When
            statisticalData.calculateAdvStatistics(statisticsMock);
            boolean result = statisticalData.getAverageNumberOfCommentsPerUser() > statisticalData.getAverageNumberOfPostsPerUser();
            statisticalData.showStatistics();

            //Then
            assertTrue(result);
        }

    }

    public List<String> generateListOfUsers(int usersQuantity) {
        List<String> userName = new ArrayList<>();
        for(int u = 0; u < usersQuantity; u++)
            userName.add("User" + u);
        return userName;
    }

    public List<String> generateListOfPosts(int postsQuantity) {
        List<String> posts = new ArrayList<>();
        for(int p = 0; p < postsQuantity; p++)
            posts.add("Post" + p);
        return posts;
    }

    public List<String> generateListOfComments(int commentsQuantity) {
        List<String> comments = new ArrayList<>();
        for (int c = 0; c < commentsQuantity; c++)
            comments.add("Comment" + c);
        return comments;
    }
}

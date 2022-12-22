package com.kodilla.testing.forum.statistic;

import javax.naming.NameNotFoundException;

public class StatisticalData {

    private Statistics statistics;

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public StatisticalData(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfUsers = statistics.userNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        this.averageNumberOfPostsPerUser = (double) this.numberOfPosts / this.numberOfUsers;
        this.averageNumberOfCommentsPerUser = (double) this.numberOfComments / this.numberOfUsers;
        this.averageNumberOfCommentsPerPost = (double) this.numberOfComments / this.numberOfPosts;

    }

    public void showStatistics() {
        System.out.println("Number of users: " + getNumberOfUsers());
        System.out.println("Number of posts: " + getNumberOfPosts());
        System.out.println("Number of comments: " + getNumberOfComments());
        System.out.println("Average number of posts per user: " + averageNumberOfPostsPerUser);
        System.out.println("Average number of comments per user: " + averageNumberOfCommentsPerUser);
        System.out.println("Average number of comments per post: " + averageNumberOfCommentsPerPost);
    }
}

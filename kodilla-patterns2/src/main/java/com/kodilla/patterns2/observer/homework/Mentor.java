package com.kodilla.patterns2.observer.homework;

public class Mentor implements QueueObserver {

    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void updateQueue(StudentTask studentTask) {
        System.out.println(mentorName + ": New task in queue " + studentTask.getTaskName() + "\n" +
                " (Total: " + studentTask.getTaskLists().size() + " to check");
        updateCount++;

    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

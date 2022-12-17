package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> resultMapOfUsers = forum.getUsersList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(users -> users.getDateOfBirth().getYear() <= LocalDate.now().minusYears(20).getYear())
                .filter(user -> user.getNumberOfPublishedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        System.out.println("Users: " + resultMapOfUsers.size());
        resultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}




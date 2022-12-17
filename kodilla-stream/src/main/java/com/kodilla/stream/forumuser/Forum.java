package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    ForumUser forumUser;
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(10, "Drago1", 'M',
                2000, 3, 1, 1));
        usersList.add(new ForumUser(2, "Steve12", 'M',
                1989, 1, 20, 2));
        usersList.add(new ForumUser(3, "Pablo55", 'M',
                1974, 10, 23, 8));
        usersList.add(new ForumUser(4, "Martha1", 'F',
                1959, 9, 15, 7));
        usersList.add(new ForumUser(5, "Alice44", 'F',
                2005, 8, 2, 4));
        usersList.add(new ForumUser(6, "Elli88", 'F',
                2008, 7, 13, 3));
        usersList.add(new ForumUser(7, "Tom12", 'M',
                2002, 12, 22, 1));
        usersList.add(new ForumUser(9, "Ally123", 'M',
                1991, 11, 18, 12));
        usersList.add(new ForumUser(8, "Teddy21", 'M',
                1994, 1, 22, 2));
        usersList.add(new ForumUser(1, "Zim77", 'M',
                1997, 2, 27, 0));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(usersList);
    }
}

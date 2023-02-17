package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
    Library library = new Library("Thrillers");
        Random random = new Random();
        for (int n = 1; n < 10; n++) {
            int month = random.nextInt(1,12);
            int dayOfMonth = random.nextInt(1,28);
            int year = random.nextInt(1950, 2020);
            library.getBooks().add(new Book("Title nr: " + n, "Author nr: " + n, LocalDate.of(year, month, dayOfMonth)));
        }

        //making a shallow copy of object library
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Shallow copy Thrillers");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepCopyLibrary = null;
        try {
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("Deep copy Thrillers");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        library.getBooks().removeAll(library.getBooks());

        //When & Then
        System.out.println("===============" + library.getName() + "====================");
        System.out.println(library.getBooks());
        System.out.println("===============" + cloneLibrary.getName() + "====================");
        System.out.println(cloneLibrary.getBooks());
        System.out.println("===============" + deepCopyLibrary.getName() + "====================");
        System.out.println(deepCopyLibrary.getBooks());
        assertEquals(0, library.getBooks().size());
        assertEquals(0, cloneLibrary.getBooks().size());
        assertEquals(9, deepCopyLibrary.getBooks().size());
        assertEquals(cloneLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepCopyLibrary.getBooks(), library.getBooks());
    }

}

package com.kodilla.testing.library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("Book Directory Test Suite")
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Nested
    @DisplayName("List books with conditions")
    class ListBooksWithConditions {

        @Test
        void testListBooksWithConditionsReturnList() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

            //When
            List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

            //Then
            assertEquals(4, theListOfBooks.size());
        }

        @Test
        void testListBooksWithConditionMoreThan20() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

            //When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

            //Then
            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOfBooks15.size());
            assertEquals(0, theListOfBooks40.size());
        }

        @Test
        void testListBooksWithConditionFragmentShorterThan3() {
            //Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            //When
            List<Book> thenListOfBooks10 = bookLibrary.listBooksWithCondition("An");

            //Then
            assertEquals(0, thenListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }
    }

    @Nested
    @DisplayName("List books in hands of user")
    class ListBooksInHandsOfUser {

        @Test
        void testListBooksInHandsOfUserIs0() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Adam", "Nowak", "824339231");
            List<Book> resultHandsOfUsersIs0 = new ArrayList<>();
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultHandsOfUsersIs0);

            //When
            List<Book> theListBooksInHandsOfUser0 = bookLibrary.listBooksInHandsOf(libraryUser);

            //Then
            assertEquals(0, theListBooksInHandsOfUser0.size());
        }

        @Test
        void testListBooksInHandsOfUserIs1() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Robert", "Kowalski", "841209221");
            List<Book> resultHandsOfUsersIs1 = generateListOfNBooks(1);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultHandsOfUsersIs1);

            //When
            List<Book> theListBooksInHandsOfUser1 = bookLibrary.listBooksInHandsOf(libraryUser);

            //Then
            assertEquals(1, theListBooksInHandsOfUser1.size());
        }

        @Test
        void testListBooksInHandsOfUserIs5() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Jan", "Stawicki", "44030104542");
            List<Book> resultHandsOfUsersIs5 = generateListOfNBooks(5);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultHandsOfUsersIs5);

            //When
            List<Book> theListBooksInHandsOfUser5 = bookLibrary.listBooksInHandsOf(libraryUser);

            //Then
            assertEquals(5, theListBooksInHandsOfUser5.size());
        }
    }
}

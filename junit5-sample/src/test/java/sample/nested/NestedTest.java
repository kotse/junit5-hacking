package sample.nested;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import sample.Library;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("Book is added to library")
class BookAddedTest {

    Books books;
    Library library;

    @BeforeEach
    void beforeEachTest() {
        books = mock(Books.class);
        library = new Library(books);
    }

    @DisplayName("when book exists")
    @Nested
    class whenBookExists {

        @BeforeEach
        void setUp() {
            when(books.exists("Effective Java")).thenReturn(true);
        }

        @DisplayName("amount++")
        @Test
        void whenBookExistsThenIncrementAmount() {
        }

        @DisplayName("check amount > limit")
        @Test
        void whenBookExistsThenCheckAmountMoreThenN() {
        }
    }

    @DisplayName("when book doesn't exists")
    @Nested
    class whenBookDoesNotExists {

        @DisplayName("create book")
        @Test
        void whenBookDoesNotExistsThenCreateABook() {}

        @DisplayName("send new book notification")
        @Test
        void whenBookDoesNotExistsThenSendNewBookNotification() {}
    }
}

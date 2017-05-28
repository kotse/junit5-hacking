package sample.nested;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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

    @DisplayName("When book exists -> amount++")
    @Test
    void whenBookExistsThenIncrementAmount() {}

    @DisplayName("When book exists -> check amount > limit")
    @Test
    void whenBookExistsThenCheckAmountMoreThenN() {}

    @DisplayName("When book doesn't exist -> create it")
    @Test
    void whenBookDoesNotExistsThenCreateABook() {}

    @DisplayName("When book doesn't exist -> send new book notification")
    @Test
    void whenBookDoesNotExistsThenSendNewBookNotification() {}
}

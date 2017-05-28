package sample.nested;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sample.Library;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookAddedTest {

    Books books;
    Library library;

    @BeforeEach
    void beforeEachTest() {
        books = mock(Books.class);
        library = new Library(books);
    }

    @Test
    void whenBookExistsThenIncrementAmount() {}

    @Test
    void whenBookExistsThenCheckAmountMoreThenN() {}

    @Test
    void whenBookDoesNotExistsThenCreateABook() {}

    @Test
    void whenBookDoesNotExistsThenSendNewBookNotification() {}
}

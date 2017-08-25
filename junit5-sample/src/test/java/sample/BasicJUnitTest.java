package sample;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class BasicJUnitTest {

    Library library;

    @BeforeAll
    static void setUpAll() {
    }

    @AfterAll
    static void tearDownAll() {
    }

    @BeforeEach
    void setUp() {
        library = new Library(new LibraryDependency());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void somethingTrue() {
        assertTrue(true);
    }

    @Test
    void assertLambda() {
        assertTrue(() -> library.returnTrue());
    }

    @Test
    void assertWithMessage() {
        assertTrue(true, "something should return 'true'");
    }

    @Test
    void exception() {
        RuntimeException exceptionThrown = assertThrows(RuntimeException.class, () -> {
            library.throwRuntimeException("message");
        });

        assertEquals("message", exceptionThrown.getMessage());
    }

    @Test
    void timeout() throws InterruptedException {
        assertTimeout(Duration.ofSeconds(1), () -> library.timeout(5L));
    }

    @Disabled
    @Test
    void multipleAssertions() {

        String s = null;
        assertAll(

                () -> assertEquals("String", "Another String"),
        () -> assertEquals("", "something")
        );
    }

    @Disabled
    @Test
    void multipleAssertionsOld() {
        assertEquals(1, 2);
        assertEquals("String", "Another String");
    }

    @Disabled
    @Test
    void disabled() {
        fail("Should not happen");
    }
}

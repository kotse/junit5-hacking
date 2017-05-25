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
        library = new Library();
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
        assertThrows(RuntimeException.class, () -> library.throwRuntimeException());
    }

    @Test
    void timeout() throws InterruptedException {
        assertTimeout(Duration.ofSeconds(1), () -> library.timeout(5L));
    }

    @Test
    void multipleAssertions() {
        assertNotEquals("Unexpected", "Actual");
        assertEquals("Actual", "Actual");
    }

    @Disabled
    @Test
    void disabled() {
        fail("Should not happen");
    }
}

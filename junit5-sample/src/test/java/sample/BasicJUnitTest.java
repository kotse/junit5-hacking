package sample;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BasicJUnitTest {

    Library library;

    @BeforeAll
    public static void setUpAll() {
    }

    @AfterAll
    public static void tearDownAll() {
    }

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void somethingTrue() {
        assertTrue(true);
    }

    @Test
    public void assertLambda() {
        assertTrue(() -> library.returnTrue());
    }

    @Test
    public void assertWithMessage() {
        assertTrue(true, "something should return 'true'");
    }

    @Test(expected = RuntimeException.class)
    public void exception() {
        library.throwRuntimeException();
    }

    @Test(timeout = 10L)
    public void timeout() throws InterruptedException {
        library.timeout(5L);
    }

    @Test
    public void multipleAssertions() {
        assertNotEquals("Unexpected", "Actual");
        assertEquals("Actual", "Actual");
    }

    @Disabled
    @Test
    public void disabled() {
        fail("Should not happen");
    }
}

package sample;

import org.junit.*;

import static org.junit.Assert.*;

public class BasicJUnitTest {

    Library library;

    @BeforeClass
    public static void setUpAll() {
    }

    @AfterClass
    public static void tearDownAll() {
    }

    @Before
    public void setUp() {
        library = new Library();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void somethingTrue() {
        assertTrue(true);
    }

    @Test
    public void assertWithMessage() {
        assertTrue("something should return 'true'", true);
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

    @Ignore
    @Test
    public void disabled() {
        fail("Should not happen");
    }
}

package sample;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class BasicJUnit4Test {

    @Mock
    LibraryDependency dependency;

    @InjectMocks
    Library library;

    @BeforeClass
    public static void setUpAll() {}

    @AfterClass
    public static void tearDownAll() {}

    @Before
    public void setUp() {}

    @After
    public void tearDown() {}

    @Test
    public void somethingTrue() {
        assertTrue(true);
    }

    @Test
    public void somethingTrueWithMessage() {
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
    public void assertThatInTest() {
        assertThat(1, is(not(2)));
    }

    @Test
    public void multipleAssertions() {
        assertNotEquals("Unexpected", "Actual");
        assertEquals("Actual", "Actual");
    }

    @Test
    public void passDependency() {
        PassedDependency passed = mock(PassedDependency.class);

        library.doSomethingWith(passed);

        verify(passed).something();
    }

    @Ignore
    public void disabled() throws Exception {
        fail("Should not happen");
    }
}

package sample;

import extensions.MockitoExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@Tag("junit5")
@ExtendWith(MockitoExtension.class)
class JUnit5Test {

    @Mock
    LibraryDependency dependency;

    @InjectMocks
    Library library;

    @BeforeAll
    static void setUpAll() {}

    @AfterAll
    static void tearDownAll() {}

    @BeforeEach
    void setUp() {}

    @AfterEach
    void tearDown() {}

    @Test
    void somethingTrue() {
        assertTrue(true);
    }

    @Test
    void somethingTrueWithMessage() {
        assertTrue(true, "should be 'true'");
    }

    @Test
    void exception() {
        assertThrows(RuntimeException.class, ()->library.throwRuntimeException());
    }

    @Test
    void timeout() throws InterruptedException {
        assertTimeout(Duration.ofSeconds(1), () -> library.timeout(5L));
    }

    @Test
    void assertThatInTest() {
        assertThat(1, is(not(2)));
    }

    @Test
    void multipleAssertions() {
        assertAll("Multiple assertions",
                ()->assertNotEquals("Unexpected", "Actual"),
                ()->assertEquals("Actual", "Actual")
        );
    }

    @Test
    void assertionWithLambda() {
        assertTrue(() -> library.returnTrue());
    }

    @Test
    void passDependency(@Mock PassedDependency passed) {
        library.doSomethingWith(passed);

        verify(passed).something();
    }

    @Disabled
    @Test
    void disabled() throws Exception {
        fail("Should not happen");
    }
}
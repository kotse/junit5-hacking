package sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class NestedTest {

    Library library;

    @BeforeEach
    void beforeEachTest() {
        library = new Library();
    }

    @Nested
    class InnerClass {
        LibraryDependency libraryDependency;

        @BeforeEach
        void beforeEachTestInInnerClass() {
            libraryDependency = new LibraryDependency();
        }

        @Test
        void incrementalSetup() {
            assertNotNull(library);
            assertNotNull(libraryDependency);
        }
    }
}

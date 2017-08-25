package sample;

import extensions.MockitoExtension;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

@ExtendWith(MockitoExtension.class)
class MockitoTest {

    @Mock
    LibraryDependency libraryDependency;

    @InjectMocks
    Library library;

    @Test
    void verifyDependency() {
        library.doSometingWithDependency();

        verify(libraryDependency).something();
    }
}

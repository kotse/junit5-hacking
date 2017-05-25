package sample;

import extensions.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class MockitoRunnerTest {

    @Mock
    LibraryDependency libraryDependency;

    @InjectMocks
    Library library;

    @Test
    public void passDependency() {
        PassedDependency passed = mock(PassedDependency.class);

        library.doSomethingWith(passed);

        verify(passed).something();
    }
}

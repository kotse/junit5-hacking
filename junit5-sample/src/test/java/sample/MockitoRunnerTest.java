package sample;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
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

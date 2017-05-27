package sample;

import extensions.LibraryParameterResolver;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(LibraryParameterResolver.class)
class ParameterResolverTest {

    @Test
    void inject_dependency(Library library) {
        assertNotNull(library);
    }
}

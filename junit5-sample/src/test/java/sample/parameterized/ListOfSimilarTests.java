package sample.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListOfSimilarTests {

    @ParameterizedTest
    @ValueSource(strings = {"str", "Strings"})
    void lessThenTenChar(String s) {
        assertTrue(s.length() < 10);
    }
}

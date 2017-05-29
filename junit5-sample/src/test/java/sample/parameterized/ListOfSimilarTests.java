package sample.parameterized;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by kotseto on 5/30/17.
 */
public class ListOfSimilarTests {

    @Test
    void strIsLessThenTenChar() {
        lessThenTenChar("str");
    }

    @Test
    void StringIsLessThenTenChar() {
        lessThenTenChar("String");
    }

    @ParameterizedTest
    @ValueSource(strings = {"str", "Strings"})
    void lessThenTenChar(String s) {
        assertTrue(s.length() < 10);
    }
}

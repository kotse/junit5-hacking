package sample.parameterized;

import org.junit.jupiter.api.Test;

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

    private void lessThenTenChar(String s) {
        assertTrue(s.length() < 10);
    }
}

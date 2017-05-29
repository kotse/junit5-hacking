package sample.parameterized;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by kotseto on 5/30/17.
 */
public class ListOfSimilarTests {

    @Test
    void strIsLessThenTenChar() {
        int value = "str".length();
        assertTrue(value < 10);
    }

    @Test
    void StringIsLessThenTenChar() {
        int value = "String".length();
        assertTrue(value < 10);
    }
}

package sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParameterizedExampleTest {

    @DisplayName("less then 10")
    @ParameterizedTest(name = "[{index}] {0} is < 10")
    @ValueSource(ints = {1, 3, 7, 9})
    void lessThenTen(int number) {
        assertTrue(number < 10);
    }

    @DisplayName("squares")
    @ParameterizedTest(name = "{0}² = {1}")
    @CsvSource({"1, 1", "2, 4", "4, 16"})
    void squares(int number, int square) {
        assertTrue(square == number * number);
    }

    @ParameterizedTest
    @DisplayName("string length")
    @MethodSource(names="stringAndIntProvider")
    void stringLength(String str, int len) {
        assertEquals(len, str.length());
    }

    static Stream<Arguments> stringAndIntProvider() {
        return Stream.of(
                ObjectArrayArguments.create("foo", 3),
                ObjectArrayArguments.create("foobar", 6)
        );
    }
}

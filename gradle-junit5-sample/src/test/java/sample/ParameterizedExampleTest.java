package sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParameterizedExampleTest {

    @ParameterizedTest
    @DisplayName("less then 10")
    @ValueSource(ints = {1, 3, 7, 9})
    void lessThenTen(int number) {
        assertTrue(number < 10);
    }

    @ParameterizedTest
    @DisplayName("squares")
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

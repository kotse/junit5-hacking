package sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("@DisplayName example")
class DisplayNameTest {

    @Test
    void testWhenWrittenInCamelCaseAreNotEasyToRead() {}

    @Test
    void test_written_using_underscore_as_word_delimiter_are_kinda_ok() {}

    @DisplayName("using @DisplayName")
    @Nested
    class usingDisplayName {

        @DisplayName("is easy to read")
        @Test
        void easyToRead() {}

        @DisplayName("is nice in nested tests")
        @Test
        void niceWithNested() {}
    }
}

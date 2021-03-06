package sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("@DisplayName example")
class DisplayNameTest {

    @Test
    void notUsingDisplayNameIsNotEasyToRead() {}

    @Test
    void not_using_display_name_better_but_not_quite_ok() {}

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

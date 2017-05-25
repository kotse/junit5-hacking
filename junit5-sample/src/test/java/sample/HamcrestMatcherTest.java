package sample;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class HamcrestMatcherTest {

    @Test
    void assertThatInTest() {
        assertThat(1, is(not(2)));
    }
}

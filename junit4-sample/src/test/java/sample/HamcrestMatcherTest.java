package sample;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class HamcrestMatcherTest {

    @Test
    public void assertThatInTest() {
        assertThat(1, is(not(2)));
    }
}

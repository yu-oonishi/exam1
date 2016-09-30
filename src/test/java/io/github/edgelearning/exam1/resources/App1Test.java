package io.github.edgelearning.exam1.resources;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * A test class for the {@link App1}.
 */
public class App1Test {

    /**
     * A test case for the {@link App1#printCurrentCounterValue()}.
     */
    @Test
    public void testPrintCurrentCounterValue() {
        App1 target = new App1();
        for (int i = 1; i < 12; i++) {
            if (i < 11) {
                assertThat(target.printCurrentCounterValue(), is(String.valueOf(i)));
            } else {
                assertThat(target.printCurrentCounterValue(), is("1"));
            }
        }
    }

}

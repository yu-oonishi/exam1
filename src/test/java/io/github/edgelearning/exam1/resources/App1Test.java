package io.github.edgelearning.exam1.resources;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
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
        assertThat(new App1().printCurrentCounterValue(), is(nullValue()));
    }

}

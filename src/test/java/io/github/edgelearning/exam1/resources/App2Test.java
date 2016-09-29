package io.github.edgelearning.exam1.resources;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * A test class for the {@link App2}.
 */
public class App2Test {

    /**
     * A test case for the {@link App2#printEnvironmentName(String)}.
     */
    @Test
    public void testEchoMessageParameter() {
        assertThat(new App2().printEnvironmentName(), is(nullValue()));
    }

}

package io.github.edgelearning.exam1.resources;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * A test class for the {@link App3}.
 */
public class App3Test {

    /**
     * A test case for the {@link App3#echoMessageParameter(String)}.
     */
    @Test
    public void testEchoMessageParameter() {
        assertThat(new App3().echoMessageParameter(""), is(nullValue()));
    }

}

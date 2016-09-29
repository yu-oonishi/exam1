package io.github.edgelearning.exam1;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.dropwizard.jersey.setup.JerseyEnvironment;
import io.dropwizard.setup.Environment;
import org.junit.Test;

/**
 * A test class for the {@link Exam1Application}.
 */
public class Exam1ApplicationTest {

    /**
     * A test case for the {@link Exam1Application#main(String[])}.
     * 
     * @throws Exception fail
     */
    @Test
    public void testMain() throws Exception {
        Exam1Application.main(new String[0]);
    }

    /**
     * A test case for the {@link Exam1Application#run(Exam1Configuration, Environment)}.
     */
    @Test
    public void testRun() {
        // Initialize variables and mock creation
        final Exam1Configuration configuration = new Exam1Configuration();
        final Environment environment = mock(Environment.class);
        final JerseyEnvironment jerseyEnvironment = mock(JerseyEnvironment.class);

        // Using mock objects
        when(environment.jersey()).thenReturn(jerseyEnvironment);

        // Verification
        Exam1Application instance = new Exam1Application();
        instance.run(configuration, environment);
    }

}

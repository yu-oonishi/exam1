package io.github.edgelearning.exam1;

import io.github.edgelearning.exam1.resources.App1;
import io.github.edgelearning.exam1.resources.App2;
import io.github.edgelearning.exam1.resources.App3;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Dropwizard based application launcher.
 */
public class Exam1Application extends Application<Exam1Configuration> {

    /**
     * Java entry point.
     * 
     * @param args the command-line arguments.
     * @throws Exception an error occurred.
     */
    public static void main(String[] args) throws Exception {
        new Exam1Application().run(args);
    }

    /**
     * @see io.dropwizard.Application#initialize(io.dropwizard.setup.Bootstrap)
     */
    @Override
    public void initialize(Bootstrap<Exam1Configuration> bootstrap) {
        // Enable variable substitution with environment variables
        bootstrap.setConfigurationSourceProvider(new SubstitutingSourceProvider(
                bootstrap.getConfigurationSourceProvider(), new EnvironmentVariableSubstitutor(false)));
        bootstrap.addBundle(new AssetsBundle());
    }

    /**
     * @see io.dropwizard.Application#run(io.dropwizard.Configuration, io.dropwizard.setup.Environment)
     */
    @Override
    public void run(Exam1Configuration configuration, Environment environment) {
        environment.jersey().register(new App1());
        environment.jersey().register(new App2());
        environment.jersey().register(new App3());
    }

}

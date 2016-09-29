package io.github.edgelearning.exam1.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/app2")
public class App2 {

    /**
     * Returns the "localhost" if a system property named "dw.server.connector.port" is "8080", otherwise "Heroku".
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String printEnvironmentName() {
        // TODO: implement this method
        return null;
    }

}

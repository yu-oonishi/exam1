package io.github.edgelearning.exam1.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/app3")
public class App3 {

    /**
     * Returns the value of a query parameter named "message" received from a user agent.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String echoMessageParameter(@QueryParam("message") String message) {
        // TODO: implement this method
        return null;
    }

}

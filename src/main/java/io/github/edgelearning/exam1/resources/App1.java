package io.github.edgelearning.exam1.resources;

import java.util.concurrent.atomic.AtomicInteger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/app1")
public class App1 {

    private AtomicInteger count = new AtomicInteger(1);

    /**
     * Returns the current value of the counter incremented with each access.
     * <p>
     * Note: initial value is 1, max value is 10, enable cycle
     * </p>
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String printCurrentCounterValue() {
        int currentNum;
        while (true) {
            currentNum = count.get();
            int nextNum = currentNum + 1;
            if (nextNum > 10) {
                nextNum = 1;
            }
            if (count.compareAndSet(currentNum, nextNum)) {
                break;
            }
        }
        return String.valueOf(currentNum);
    }

}

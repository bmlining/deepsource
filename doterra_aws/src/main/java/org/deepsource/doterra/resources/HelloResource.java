package org.deepsource.doterra.resources;

import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.deepsource.doterra.representations.HelloResponse;

import com.codahale.metrics.annotation.Timed;

@Path("/hello")
public class HelloResource {
	private static final AtomicLong counter = new AtomicLong();
	
	@GET
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public HelloResponse sayHello(@QueryParam("name") String name) {
        return new HelloResponse(counter.incrementAndGet(), name);
    }
}

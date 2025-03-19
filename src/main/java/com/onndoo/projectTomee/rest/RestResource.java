package com.onndoo.projectTomee.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("rest")
public class RestResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public HelloRecord hello() {
		return new HelloRecord("Hello from Jakarta EE");
	}
}

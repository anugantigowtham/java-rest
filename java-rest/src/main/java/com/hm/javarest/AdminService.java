package com.hm.javarest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

public class AdminService extends UserService{

	@POST
	@Path("/addUser")
	@Consumes("application/json")
	public void addUser() {

	}

	@GET
	@Path("/listUsers")
	@Produces("application/json")
	public void getUsers() {

	}

	@GET
	@Path("/user/(userName)")
	@Produces("application/json")
	public void getUserByName(@PathParam(value = "staffName") String name) {

	}

}

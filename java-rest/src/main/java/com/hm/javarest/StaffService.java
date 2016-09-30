package com.hm.javarest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.hm.vo.StaffVO;

@Path("/staff")
public class StaffService extends UserService {

	@POST
	@Path("/addStaff")
	@Consumes("application/json")
	public <T> void addUser(T t) {
		StaffVO staffVo = (StaffVO) t;
	}

	@GET
	@Path("/listStaff")
	@Produces("application/json")
	public void getUsers() {

	}

	@GET
	@Path("/user/(staffName)")
	@Produces("application/json")
	public void getUserByName(@PathParam(value = "staffName") String name) {

	}

}

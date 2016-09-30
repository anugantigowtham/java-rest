package com.hm.javarest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.hm.vo.StaffVO;
import com.hm.vo.UserVo;

public class AdminService extends UserService {

	Map<Integer, UserVo> userMap = new HashMap<>();

	int lastKey;

	@POST
	@Path("/addUser")
	@Consumes("application/json")
	public <T> void addUser(T t) {
		UserVo userVo = (UserVo) t;
		Integer[] keyArr = (Integer[]) userMap.keySet().toArray();
		lastKey = keyArr[userMap.size() - 1];
		userMap.put(lastKey+1, userVo);

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

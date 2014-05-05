package com.essence.csmdemo.privilege.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.essence.csmdemo.common.pagin.HandlerResult;
import com.essence.csmdemo.common.pagin.PageVO;
import com.essence.csmdemo.privilege.vo.UserVO;


@Path("/user")
@Produces({"application/json"})
@Consumes({ "application/json" })
public interface IUserServices {

	@POST
	@Path("/add")
	public void addUser(UserVO userVO);

	@PUT
	@Path("/update")
	public void updateUser(UserVO userVO);

	@POST
	@Path("/del")
	public void deleteUser(UserVO userVO);

	@GET
	@Path("/list/{currentPage}/{pageSize}")
	public HandlerResult findPagedList(@QueryParam("") UserVO userVO,@PathParam("") PageVO pageVO);

	@GET
	@Path("/single/{userId}")
	public UserVO findUser(@PathParam("userId") Integer userId);

}

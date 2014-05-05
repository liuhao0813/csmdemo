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
import com.essence.csmdemo.privilege.vo.RoleVO;

@Path("/role")
@Produces({ "application/json" })
@Consumes({ "application/json" })
public interface IRoleServices {

	@POST
	@Path("/add")
	public void addRole(RoleVO roleVO);

	@PUT
	@Path("/update")
	public void updateRole(RoleVO roleVO);

	@POST
	@Path("/del")
	public void deleteRole(RoleVO roleVO);

	@GET
	@Path("/list/{currentPage}/{pageSize}")
	public HandlerResult findPagedList(@QueryParam("") RoleVO roleVO,
			@PathParam("") PageVO pageVO);

	@GET
	@Path("/single/{roleId}")
	public RoleVO findRole(@PathParam("roleId") Integer roleId);
	
	
}

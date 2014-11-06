package cn.erpreport.it.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cn.erpreport.it.vo.TbDocVO;

@Path("/doc")
@Produces({MediaType.APPLICATION_JSON})   
@Consumes({MediaType.APPLICATION_JSON})
public interface ITbDocService {

	@POST
	@Path("/del/{docId}")
    public String delete(@PathParam("docId") String docId);
	
	@POST
	@Path("/insert")
    public String insert(TbDocVO record);
	
	@GET
	@Path("/single/{docId}")
    public TbDocVO selectById(@PathParam("") String docId);
	
	@POST
    @Path("/list")
    public List<TbDocVO> selectAllList(TbDocVO tbDocVO);
    
	@POST
    @Path("/udpate")
    public String update(TbDocVO record);
}

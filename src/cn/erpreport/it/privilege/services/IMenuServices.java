package cn.erpreport.it.privilege.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import cn.erpreport.it.common.pager.HandlerResult;
import cn.erpreport.it.common.pager.PageVO;
import cn.erpreport.it.privilege.vo.MenuVO;

/**
 * 菜单服务接口
 *
 */
@Path("/menu")
@Produces({ "application/json" })
@Consumes({ "application/json" })
public interface IMenuServices {

	/**
	 * 添加菜单项
	 * 
	 * @param menuVO
	 *            得到传入的菜单对象
	 */
	@POST
	@Path("/add")
	public void addMenu(MenuVO menuVO);

	/**
	 * 修改菜单项
	 * 
	 * @param menuVO
	 *            得到传入的菜单项
	 */
	@PUT
	@Path("/update")
	public void updateMenu(MenuVO menuVO);

	/**
	 * 删除菜单项
	 * 
	 * @param menuVO
	 *            得到要删除的菜单对象
	 */
	@POST
	@Path("/del")
	public void deleteMenu(MenuVO menuVO);

	/**
	 * 查询菜单项信息，并进行分页
	 * 
	 * @param menuVO
	 *            得到传入的菜单对象，按此对象就行查询
	 * @param pageVO
	 *            得到分页参数
	 * @return
	 */
	@GET
	@Path("/list/{currentPage}/{pageSize}")
	public HandlerResult findPagedList(@QueryParam("") MenuVO menuVO,
			@PathParam("") PageVO pageVO);

	/**
	 * 根据传入的菜单ID，取得单个的菜单对象
	 * 
	 * @param menuId
	 *            传入的菜单ID
	 * @return
	 */
	@GET
	@Path("/single/{menuId}")
	public MenuVO findMenu(@PathParam("menuId") Integer menuId);

}

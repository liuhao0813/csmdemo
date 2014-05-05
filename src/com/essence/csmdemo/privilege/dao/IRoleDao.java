package com.essence.csmdemo.privilege.dao;

import com.essence.csmdemo.common.pagin.HandlerResult;
import com.essence.csmdemo.common.pagin.PageVO;
import com.essence.csmdemo.privilege.vo.RoleVO;

public interface IRoleDao {
	
	/**
	 * 添加一条角色记录
	 * @param roleVO
	 */
	public void insert(RoleVO roleVO);
	
	/**
	 * 修改一个角色
	 * @param roleVO
	 */
	public void update(RoleVO roleVO);
	
	/**
	 * 删除一个角色
	 * @param roleVO
	 */
	public void delete(RoleVO roleVO);
	
	/**
	 * 查找角色信息并进行分页
	 * @param roleVO  查找角色需要的条件
	 * @param pageVO  分页参数
	 */
	public HandlerResult findPagedList(RoleVO roleVO,PageVO pageVO);
	
	/**
	 * 根据对象取得单独的角色信息
	 * @param roleVO
	 * @return
	 */
	public RoleVO findRole(Integer roleID);
	
}

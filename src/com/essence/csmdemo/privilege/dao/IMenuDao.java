package com.essence.csmdemo.privilege.dao;

import com.essence.csmdemo.common.pagin.HandlerResult;
import com.essence.csmdemo.common.pagin.PageVO;
import com.essence.csmdemo.privilege.vo.MenuVO;

public interface IMenuDao {
	
	/**
	 * 添加一条菜单记录
	 * @param menuVO
	 */
	public void insert(MenuVO menuVO);
	
	/**
	 * 修改一个菜单
	 * @param menuVO
	 */
	public void update(MenuVO menuVO);
	
	/**
	 * 删除一个菜单
	 * @param menuVO
	 */
	public void delete(MenuVO menuVO);
	
	/**
	 * 查找菜单息并进行分页
	 * @param menuVO  查找菜单需要的条件
	 * @param pageVO  分页参数
	 */
	public HandlerResult findPagedList(MenuVO menuVO,PageVO pageVO);
	
	/**
	 * 根据对象取得单独的菜单信息
	 * @param menuId
	 * @return
	 */
	public MenuVO findMenu(Integer menuId);
}

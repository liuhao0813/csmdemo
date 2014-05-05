package com.essence.csmdemo.privilege.dao;

import com.essence.csmdemo.common.pagin.HandlerResult;
import com.essence.csmdemo.common.pagin.PageVO;
import com.essence.csmdemo.privilege.vo.UserVO;

public interface IUserDao {
	
	/**
	 * 添加一条用户记录
	 * @param userVO
	 */
	public void insert(UserVO userVO);
	
	/**
	 * 修改一个用户
	 * @param userVO
	 */
	public void update(UserVO userVO);
	
	/**
	 * 删除一个用户
	 * @param userVO
	 */
	public void delete(UserVO userVO);
	
	/**
	 * 查找用户息并进行分页
	 * @param userVO  查找用户需要的条件
	 * @param pageVO  分页参数
	 */
	public HandlerResult findPagedList(UserVO userVO,PageVO pageVO);
	
	/**
	 * 根据对象取得单独的用户信息
	 * @param userVO
	 * @return
	 */
	public UserVO findUser(Integer userId);
}

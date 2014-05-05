package com.essence.csmdemo.privilege.services.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.essence.csmdemo.common.pagin.HandlerResult;
import com.essence.csmdemo.common.pagin.PageVO;
import com.essence.csmdemo.privilege.dao.IUserDao;
import com.essence.csmdemo.privilege.services.IUserServices;
import com.essence.csmdemo.privilege.vo.UserVO;

@Named
public class UserServicesImpl implements IUserServices {

	@Inject
	private IUserDao userDao;
	
	public void addUser(UserVO userVO) {
		userDao.insert(userVO);
	}

	public void updateUser(UserVO userVO) {
		userDao.update(userVO);
	}

	public void deleteUser(UserVO userVO) {
		userDao.delete(userVO);
	}

	public HandlerResult findPagedList(UserVO userVO,PageVO pageVO) {
		return userDao.findPagedList(userVO, pageVO);
	}

	public UserVO findUser(Integer userId) {
		return userDao.findUser(userId);
	}

}

package cn.erpreport.it.privilege.services.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import cn.erpreport.it.common.pager.HandlerResult;
import cn.erpreport.it.common.pager.PageVO;
import cn.erpreport.it.privilege.aop.OperationSource;
import cn.erpreport.it.privilege.dao.IUserDao;
import cn.erpreport.it.privilege.services.IUserServices;
import cn.erpreport.it.privilege.vo.UserVO;

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
	
	public List<UserVO> findPagedList2() {
		return userDao.findPagedList2();
	}

}

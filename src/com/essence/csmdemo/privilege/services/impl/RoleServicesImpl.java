package com.essence.csmdemo.privilege.services.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.essence.csmdemo.common.pagin.HandlerResult;
import com.essence.csmdemo.common.pagin.PageVO;
import com.essence.csmdemo.privilege.dao.IRoleDao;
import com.essence.csmdemo.privilege.services.IRoleServices;
import com.essence.csmdemo.privilege.vo.RoleVO;

@Named
public class RoleServicesImpl implements IRoleServices {

	@Inject
	private IRoleDao roleDao;
	
	public void addRole(RoleVO roleVO) {
		roleDao.insert(roleVO);
		
	}

	public void updateRole(RoleVO roleVO) {
		roleDao.update(roleVO);
		
	}

	public void deleteRole(RoleVO roleVO) {
		roleDao.delete(roleVO);
		
	}

	public HandlerResult findPagedList(RoleVO roleVO,PageVO pageVO) {
		return roleDao.findPagedList(roleVO, pageVO);
	}

	public RoleVO findRole(Integer roleId) {
		return roleDao.findRole(roleId);
	}


}

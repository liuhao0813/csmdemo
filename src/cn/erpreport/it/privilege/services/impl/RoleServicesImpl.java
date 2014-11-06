package cn.erpreport.it.privilege.services.impl;

import javax.inject.Inject;
import javax.inject.Named;

import cn.erpreport.it.common.pager.HandlerResult;
import cn.erpreport.it.common.pager.PageVO;
import cn.erpreport.it.privilege.dao.IRoleDao;
import cn.erpreport.it.privilege.services.IRoleServices;
import cn.erpreport.it.privilege.vo.RoleVO;

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

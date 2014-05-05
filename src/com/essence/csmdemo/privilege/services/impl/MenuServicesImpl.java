package com.essence.csmdemo.privilege.services.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import com.essence.csmdemo.common.pagin.HandlerResult;
import com.essence.csmdemo.common.pagin.PageVO;
import com.essence.csmdemo.privilege.dao.IMenuDao;
import com.essence.csmdemo.privilege.services.IMenuServices;
import com.essence.csmdemo.privilege.vo.MenuVO;


@Named
public class MenuServicesImpl implements IMenuServices {
	
	@Inject
	private IMenuDao menuDao;
	
	@Transactional
	public void addMenu(MenuVO menuVO) {
		menuDao.insert(menuVO);
		
	}
	
	public void updateMenu(MenuVO menuVO) {
		menuDao.update(menuVO);
		
	}
	
	public void deleteMenu(MenuVO menuVO) {
		menuDao.delete(menuVO);
		
	}
	
	public HandlerResult findPagedList(MenuVO menuVO,PageVO pageVO) {
		return menuDao.findPagedList(menuVO, pageVO);
	}
	
	public MenuVO findMenu(Integer menuId) {
		return menuDao.findMenu(menuId);
	}

}

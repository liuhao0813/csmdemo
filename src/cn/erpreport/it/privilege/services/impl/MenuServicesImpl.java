package cn.erpreport.it.privilege.services.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import cn.erpreport.it.common.pager.HandlerResult;
import cn.erpreport.it.common.pager.PageVO;
import cn.erpreport.it.privilege.aop.OperationSource;
import cn.erpreport.it.privilege.dao.IMenuDao;
import cn.erpreport.it.privilege.services.IMenuServices;
import cn.erpreport.it.privilege.vo.MenuVO;


@OperationSource(code="menu", operation = "descripton")
@Named
public class MenuServicesImpl implements IMenuServices {
	
	@Inject
	private IMenuDao menuDao;
	
	@OperationSource(code="menu",operation="add")
	@Transactional
	public void addMenu(MenuVO menuVO) {
		menuDao.insert(menuVO);
		
	}
	@OperationSource(code="menu",operation="update")
	public void updateMenu(MenuVO menuVO) {
		menuDao.update(menuVO);
		
	}
	@OperationSource(code="menu",operation="delete")
	public void deleteMenu(MenuVO menuVO) {
		menuDao.delete(menuVO);
		
	}
	@OperationSource(code="menu",operation="query")
	public HandlerResult findPagedList(MenuVO menuVO,PageVO pageVO) {
		return menuDao.findPagedList(menuVO, pageVO);
	}
	
	public MenuVO findMenu(Integer menuId) {
		return menuDao.findMenu(menuId);
	}

}

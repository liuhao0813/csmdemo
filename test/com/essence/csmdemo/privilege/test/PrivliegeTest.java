package com.essence.csmdemo.privilege.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.essence.csmdemo.privilege.services.IMenuServices;
import com.essence.csmdemo.privilege.services.IRoleServices;
import com.essence.csmdemo.privilege.services.IUserServices;
import com.essence.csmdemo.privilege.vo.MenuVO;
import com.essence.csmdemo.privilege.vo.RoleVO;
import com.essence.csmdemo.privilege.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
@Transactional
@TransactionConfiguration(defaultRollback=false)
public class PrivliegeTest {

	@Autowired
	private IMenuServices menuServices;
	@Autowired
	private IUserServices userServices;
	@Autowired
	private IRoleServices roleServices;

	@Test
	public void testMenuAdd() {
		MenuVO menuVO =new MenuVO();
		menuVO.setMenuName("系统管理");
		menuServices.addMenu(menuVO);
	}

	@Test
	public void testMenuUdpate() {
		MenuVO menuVO =new MenuVO();
		menuVO.setMenuId(8);
		menuVO.setMenuName("菜单管理");
		menuServices.updateMenu(menuVO);
		
	}
	
	@Test
	public void testMenuDel() {
		MenuVO menuVO =new MenuVO();
		menuVO.setMenuId(10);
		menuVO.setMenuName("菜单管理");
		menuServices.deleteMenu(menuVO);
		
	}
	
	@Test
	public void testFindMenu() {
		MenuVO menuVO =new MenuVO();
		menuVO = menuServices.findMenu(8);
		System.out.println(menuVO.getMenuName());
	}
	
	@Test
	public void testRoleAdd() {
		
		RoleVO roleVO =new RoleVO();
		roleVO.setRoleName("系统管理员");
		roleServices.addRole(roleVO);
	}

	@Test
	public void testRoleUdpate() {
		RoleVO roleVO =new RoleVO();
		roleVO.setRoleId(3);
		roleVO.setRoleName("管理员");
		roleServices.updateRole(roleVO);
		
	}
	
	@Test
	public void testRoleDel() {
		RoleVO roleVO =new RoleVO();
		roleVO.setRoleId(3);
		roleVO.setRoleName("系统管理员");
		roleServices.deleteRole(roleVO);
		
	}
	
	@Test
	public void testFindRole() {
		RoleVO roleVO =new RoleVO();
		roleVO = roleServices.findRole(2);
		System.out.println(roleVO.getRoleName());
	}
	
	@Test
	public void testUserAdd() {
		
		UserVO userVO =new UserVO();
		userVO.setUsername("administrator");
		userVO.setPassword("admin123");
		userVO.setNotes("工程部主管");
		userVO.setStatus(1);
		userServices.addUser(userVO);
	}

	@Test
	public void testUserUdpate() {
		UserVO userVO =new UserVO();
		userVO.setUserId(1);
		userVO.setUsername("admin");
		userVO.setPassword("admin456");
		userVO.setNotes("工程部主管A");
		userVO.setStatus(1);
		userServices.updateUser(userVO);
		
	}
	
	@Test
	public void testUserDel() {
		UserVO userVO =new UserVO();
		userVO.setUserId(1);
		userVO.setUsername("admin");
		userVO.setPassword("admin456");
		userVO.setNotes("工程部主管A");
		userVO.setStatus(1);
		userServices.deleteUser(userVO);
		
	}
	
	@Test
	public void testFindUser() {
		UserVO userVO =new UserVO();
		userVO = userServices.findUser(2);
		System.out.println(userVO.getUsername());
	}
	
	@Test
	public void testFindUser2() {
		List<UserVO> users = userServices.findPagedList2();
		for(UserVO user:users){
			System.out.println("-------------------------------------------------"+user.getUsername());
		}
	}
}

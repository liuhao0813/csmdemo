package com.essence.csmdemo.privilege.vo;

import java.util.List;

import com.essence.csmdemo.common.BaseVO;

/**
 * 用户VO
 */
public class UserVO extends BaseVO{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 用户ID
	 */
	private Integer userId;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 用户描述
	 */
	private String Notes;
	/**
	 * 用户状态
	 */
	private Integer status;
	/**
	 * 最后一次登录时间
	 */
    private String last_login;
    
    /**
     * 用户对应的角色信息
     */
    private List<RoleVO> listRoles;
    
    /**
     * 用户授权的菜单信息
     */
    private List<MenuVO> listMenus;

    
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getLast_login() {
		return last_login;
	}
	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}
	public List<RoleVO> getListRoles() {
		return listRoles;
	}
	public void setListRoles(List<RoleVO> listRoles) {
		this.listRoles = listRoles;
	}
	public List<MenuVO> getListMenus() {
		return listMenus;
	}
	public void setListMenus(List<MenuVO> listMenus) {
		this.listMenus = listMenus;
	}
    
    
}

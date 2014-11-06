package cn.erpreport.it.privilege.vo;

import java.util.List;

import cn.erpreport.it.common.BaseVO;

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
	private String userName;
	/**
	 * 用户密码
	 */
	private String password;
	
	private String sex;
	
	private String defaultRole;
	
	private String email;
	
	private String phone;
	
	private String fax;
	
	private String beginDate;
	private String endDate;
	
	/**
	 * 用户状态
	 */
	private Integer status;
	/**
	 * 最后一次登录时间
	 */
    private String lastLogin;
    
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
	public String getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDefaultRole() {
		return defaultRole;
	}
	public void setDefaultRole(String defaultRole) {
		this.defaultRole = defaultRole;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
    
    
}

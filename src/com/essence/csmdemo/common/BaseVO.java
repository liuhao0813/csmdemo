package com.essence.csmdemo.common;

import java.io.Serializable;


/**
 * 基本公共字段列
 *
 */
public class BaseVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 创建人
	 */
	private String createdBy;
	/**
	 * 创建时间
	 */
	private String createDate;
	/**
	 * 修改人
	 */
	private String updatedBy;
	/**
	 * 修改时间
	 */
	private String updateDate;
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	

}

package com.essence.csmdemo.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TbDocVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String docId;
	private String title;
	private String docType;
	private String needPermission;
	private String createDate;
	private String logReadHis;

	private String piority;

	private String confidential;

	private String draftDeptCode;

	private String draftDeptName;

	private String draftUserId;

	private String draftUserName;

	private String draftUserPhone;

	private String publishUserId;

	private String publishUserName;

	private String publishDate;

	private String publishDeptCode;

	private String publishDeptName;

	private String expiredate;

	private String remark;

	private String tags;

	private String createUserId;

	private String updateDate;

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = (docId==""||docId == null)? null : docId.trim();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = (title==""||title == null)? null : title.trim();
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = (docType==""||docType == null)? null : docType.trim();
	}

	public String getNeedPermission() {
		return needPermission;
	}

	public void setNeedPermission(String needPermission) {
		this.needPermission = (needPermission==""||needPermission == null)? null : needPermission.trim();
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = (createDate==""||createDate == null)? null : createDate.trim();
	}

	public String getLogReadHis() {
		return logReadHis;
	}

	public void setLogReadHis(String logReadHis) {
		this.logReadHis = (logReadHis==""||logReadHis == null)? null : logReadHis.trim();
	}

	public String getPiority() {
		return piority;
	}

	public void setPiority(String piority) {
		this.piority = piority;
	}

	public String getConfidential() {
		return confidential;
	}

	public void setConfidential(String confidential) {
		this.confidential = confidential;
	}

	public String getDraftDeptCode() {
		return draftDeptCode;
	}

	public void setDraftDeptCode(String draftDeptCode) {
		this.draftDeptCode = draftDeptCode;
	}

	public String getDraftDeptName() {
		return draftDeptName;
	}

	public void setDraftDeptName(String draftDeptName) {
		this.draftDeptName = draftDeptName;
	}

	public String getDraftUserId() {
		return draftUserId;
	}

	public void setDraftUserId(String draftUserId) {
		this.draftUserId = draftUserId;
	}

	public String getDraftUserName() {
		return draftUserName;
	}

	public void setDraftUserName(String draftUserName) {
		this.draftUserName = draftUserName;
	}

	public String getDraftUserPhone() {
		return draftUserPhone;
	}

	public void setDraftUserPhone(String draftUserPhone) {
		this.draftUserPhone = draftUserPhone;
	}

	public String getPublishUserId() {
		return publishUserId;
	}

	public void setPublishUserId(String publishUserId) {
		this.publishUserId = publishUserId;
	}

	public String getPublishUserName() {
		return publishUserName;
	}

	public void setPublishUserName(String publishUserName) {
		this.publishUserName = publishUserName;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getPublishDeptCode() {
		return publishDeptCode;
	}

	public void setPublishDeptCode(String publishDeptCode) {
		this.publishDeptCode = publishDeptCode;
	}

	public String getPublishDeptName() {
		return publishDeptName;
	}

	public void setPublishDeptName(String publishDeptName) {
		this.publishDeptName = publishDeptName;
	}

	public String getExpiredate() {
		return expiredate;
	}

	public void setExpiredate(String expiredate) {
		this.expiredate = expiredate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

}
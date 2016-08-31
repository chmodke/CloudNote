package org.kehao.note.model;

import java.util.Date;

/**
 * CnUser entity. @author MyEclipse Persistence Tools
 */

public class CnUser implements java.io.Serializable {
	private static final long serialVersionUID = 5346889751346087116L;
	private String cnUserId;
	private String cnUserName;
	private String cnUserPassword;
	private String cnUserToken;
	private String cnUserDesc;
	private String cnUserEmail;
	private Integer cnUserActiveStatus;
	private String cnUserValidateCode;
	private Date cnUserCreateTime;

	// Constructors

	/** default constructor */
	public CnUser() {
	}

	/** minimal constructor */
	public CnUser(String cnUserEmail, Integer cnUserActiveStatus) {
		this.cnUserEmail = cnUserEmail;
		this.cnUserActiveStatus = cnUserActiveStatus;
	}

	/** full constructor */
	public CnUser(String cnUserName, String cnUserPassword, String cnUserToken,
			String cnUserDesc, String cnUserEmail, Integer cnUserActiveStatus,
			String cnUserValidateCode, Date cnUserCreateTime) {
		this.cnUserName = cnUserName;
		this.cnUserPassword = cnUserPassword;
		this.cnUserToken = cnUserToken;
		this.cnUserDesc = cnUserDesc;
		this.cnUserEmail = cnUserEmail;
		this.cnUserActiveStatus = cnUserActiveStatus;
		this.cnUserValidateCode = cnUserValidateCode;
		this.cnUserCreateTime = cnUserCreateTime;
	}

	// Property accessors

	public String getCnUserId() {
		return this.cnUserId;
	}

	public void setCnUserId(String cnUserId) {
		this.cnUserId = cnUserId;
	}

	public String getCnUserName() {
		return this.cnUserName;
	}

	public void setCnUserName(String cnUserName) {
		this.cnUserName = cnUserName;
	}

	public String getCnUserPassword() {
		return this.cnUserPassword;
	}

	public void setCnUserPassword(String cnUserPassword) {
		this.cnUserPassword = cnUserPassword;
	}

	public String getCnUserToken() {
		return this.cnUserToken;
	}

	public void setCnUserToken(String cnUserToken) {
		this.cnUserToken = cnUserToken;
	}

	public String getCnUserDesc() {
		return this.cnUserDesc;
	}

	public void setCnUserDesc(String cnUserDesc) {
		this.cnUserDesc = cnUserDesc;
	}

	public String getCnUserEmail() {
		return this.cnUserEmail;
	}

	public void setCnUserEmail(String cnUserEmail) {
		this.cnUserEmail = cnUserEmail;
	}

	public Integer getCnUserActiveStatus() {
		return this.cnUserActiveStatus;
	}

	public void setCnUserActiveStatus(Integer cnUserActiveStatus) {
		this.cnUserActiveStatus = cnUserActiveStatus;
	}

	public String getCnUserValidateCode() {
		return this.cnUserValidateCode;
	}

	public void setCnUserValidateCode(String cnUserValidateCode) {
		this.cnUserValidateCode = cnUserValidateCode;
	}

	public Date getCnUserCreateTime() {
		return this.cnUserCreateTime;
	}

	public void setCnUserCreateTime(Date cnUserCreateTime) {
		this.cnUserCreateTime = cnUserCreateTime;
	}

}
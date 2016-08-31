package org.kehao.note.model;

/**
 * CnActivityStatus entity. @author MyEclipse Persistence Tools
 */

public class CnActivityStatus implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = -4217161885463810704L;
	private String cnActivityStatusId;
	private CnActivity cnActivity;
	private String cnActivityStatusCode;
	private String cnActivityStatusName;

	// Constructors

	/** default constructor */
	public CnActivityStatus() {
	}

	/** full constructor */
	public CnActivityStatus(CnActivity cnActivity, String cnActivityStatusCode,
			String cnActivityStatusName) {
		this.cnActivity = cnActivity;
		this.cnActivityStatusCode = cnActivityStatusCode;
		this.cnActivityStatusName = cnActivityStatusName;
	}

	// Property accessors

	public String getCnActivityStatusId() {
		return this.cnActivityStatusId;
	}

	public void setCnActivityStatusId(String cnActivityStatusId) {
		this.cnActivityStatusId = cnActivityStatusId;
	}

	public CnActivity getCnActivity() {
		return this.cnActivity;
	}

	public void setCnActivity(CnActivity cnActivity) {
		this.cnActivity = cnActivity;
	}

	public String getCnActivityStatusCode() {
		return this.cnActivityStatusCode;
	}

	public void setCnActivityStatusCode(String cnActivityStatusCode) {
		this.cnActivityStatusCode = cnActivityStatusCode;
	}

	public String getCnActivityStatusName() {
		return this.cnActivityStatusName;
	}

	public void setCnActivityStatusName(String cnActivityStatusName) {
		this.cnActivityStatusName = cnActivityStatusName;
	}

}
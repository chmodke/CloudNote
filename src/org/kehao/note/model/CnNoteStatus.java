package org.kehao.note.model;

/**
 * CnNoteStatus entity. @author MyEclipse Persistence Tools
 */

public class CnNoteStatus implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -1266055509321169977L;
	private String cnNoteStatusId;
	private String cnNoteStatusCode;
	private String cnNoteStatusName;

	// Constructors

	/** default constructor */
	public CnNoteStatus() {
	}

	/** full constructor */
	public CnNoteStatus(String cnNoteStatusCode, String cnNoteStatusName) {
		this.cnNoteStatusCode = cnNoteStatusCode;
		this.cnNoteStatusName = cnNoteStatusName;
	}

	// Property accessors

	public String getCnNoteStatusId() {
		return this.cnNoteStatusId;
	}

	public void setCnNoteStatusId(String cnNoteStatusId) {
		this.cnNoteStatusId = cnNoteStatusId;
	}

	public String getCnNoteStatusCode() {
		return this.cnNoteStatusCode;
	}

	public void setCnNoteStatusCode(String cnNoteStatusCode) {
		this.cnNoteStatusCode = cnNoteStatusCode;
	}

	public String getCnNoteStatusName() {
		return this.cnNoteStatusName;
	}

	public void setCnNoteStatusName(String cnNoteStatusName) {
		this.cnNoteStatusName = cnNoteStatusName;
	}

}
package org.kehao.note.model;

/**
 * CnNoteType entity. @author MyEclipse Persistence Tools
 */

public class CnNoteType implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -7781846879787998878L;
	private String cnNoteTypeId;
	private String cnNoteTypeCode;
	private String cnNoteTypeName;
	private String cnNoteTypeDesc;

	// Constructors

	/** default constructor */
	public CnNoteType() {
	}

	/** full constructor */
	public CnNoteType(String cnNoteTypeCode, String cnNoteTypeName,
			String cnNoteTypeDesc) {
		this.cnNoteTypeCode = cnNoteTypeCode;
		this.cnNoteTypeName = cnNoteTypeName;
		this.cnNoteTypeDesc = cnNoteTypeDesc;
	}

	// Property accessors

	public String getCnNoteTypeId() {
		return this.cnNoteTypeId;
	}

	public void setCnNoteTypeId(String cnNoteTypeId) {
		this.cnNoteTypeId = cnNoteTypeId;
	}

	public String getCnNoteTypeCode() {
		return this.cnNoteTypeCode;
	}

	public void setCnNoteTypeCode(String cnNoteTypeCode) {
		this.cnNoteTypeCode = cnNoteTypeCode;
	}

	public String getCnNoteTypeName() {
		return this.cnNoteTypeName;
	}

	public void setCnNoteTypeName(String cnNoteTypeName) {
		this.cnNoteTypeName = cnNoteTypeName;
	}

	public String getCnNoteTypeDesc() {
		return this.cnNoteTypeDesc;
	}

	public void setCnNoteTypeDesc(String cnNoteTypeDesc) {
		this.cnNoteTypeDesc = cnNoteTypeDesc;
	}

}
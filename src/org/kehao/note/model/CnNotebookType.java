package org.kehao.note.model;

/**
 * CnNotebookType entity. @author MyEclipse Persistence Tools
 */

public class CnNotebookType implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = -5442828453434741802L;
	private String cnNotebookTypeId;
	private String cnNotebookTypeCode;
	private String cnNotebookTypeName;
	private String cnNotebookTypeDesc;

	// Constructors

	/** default constructor */
	public CnNotebookType() {
	}

	/** full constructor */
	public CnNotebookType(String cnNotebookTypeCode, String cnNotebookTypeName,
			String cnNotebookTypeDesc) {
		this.cnNotebookTypeCode = cnNotebookTypeCode;
		this.cnNotebookTypeName = cnNotebookTypeName;
		this.cnNotebookTypeDesc = cnNotebookTypeDesc;
	}

	// Property accessors

	public String getCnNotebookTypeId() {
		return this.cnNotebookTypeId;
	}

	public void setCnNotebookTypeId(String cnNotebookTypeId) {
		this.cnNotebookTypeId = cnNotebookTypeId;
	}

	public String getCnNotebookTypeCode() {
		return this.cnNotebookTypeCode;
	}

	public void setCnNotebookTypeCode(String cnNotebookTypeCode) {
		this.cnNotebookTypeCode = cnNotebookTypeCode;
	}

	public String getCnNotebookTypeName() {
		return this.cnNotebookTypeName;
	}

	public void setCnNotebookTypeName(String cnNotebookTypeName) {
		this.cnNotebookTypeName = cnNotebookTypeName;
	}

	public String getCnNotebookTypeDesc() {
		return this.cnNotebookTypeDesc;
	}

	public void setCnNotebookTypeDesc(String cnNotebookTypeDesc) {
		this.cnNotebookTypeDesc = cnNotebookTypeDesc;
	}

}
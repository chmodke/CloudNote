package org.kehao.note.model;

/**
 * CnShare entity. @author MyEclipse Persistence Tools
 */

public class CnShare implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 6142672363779550599L;
	private String cnShareId;
	private String cnShareTitle;
	private String cnShareBody;
	private String cnNoteId;

	// Constructors

	/** default constructor */
	public CnShare() {
	}

	/** full constructor */
	public CnShare(String cnShareTitle, String cnShareBody, String cnNoteId) {
		this.cnShareTitle = cnShareTitle;
		this.cnShareBody = cnShareBody;
		this.cnNoteId = cnNoteId;
	}

	// Property accessors

	public String getCnShareId() {
		return this.cnShareId;
	}

	public void setCnShareId(String cnShareId) {
		this.cnShareId = cnShareId;
	}

	public String getCnShareTitle() {
		return this.cnShareTitle;
	}

	public void setCnShareTitle(String cnShareTitle) {
		this.cnShareTitle = cnShareTitle;
	}

	public String getCnShareBody() {
		return this.cnShareBody;
	}

	public void setCnShareBody(String cnShareBody) {
		this.cnShareBody = cnShareBody;
	}

	public String getCnNoteId() {
		return this.cnNoteId;
	}

	public void setCnNoteId(String cnNoteId) {
		this.cnNoteId = cnNoteId;
	}

}
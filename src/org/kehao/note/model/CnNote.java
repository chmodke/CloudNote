package org.kehao.note.model;

/**
 * CnNote entity. @author MyEclipse Persistence Tools
 */

public class CnNote implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = -6888874990281467527L;
	private String cnNoteId;
	private String cnNotebookId;
	private String cnUserId;
	private String cnNoteStatusId;
	private String cnNoteTypeId;
	private String cnNoteTitle;
	private String cnNoteBody;
	private long cnNoteCreateTime;
	private long cnNoteLastModifyTime;

	// Constructors

	/** default constructor */
	public CnNote() {
	}

	/** full constructor */
	public CnNote(String cnNotebookId, String cnUserId, String cnNoteStatusId,
			String cnNoteTypeId, String cnNoteTitle, String cnNoteBody,
			long cnNoteCreateTime, long cnNoteLastModifyTime) {
		this.cnNotebookId = cnNotebookId;
		this.cnUserId = cnUserId;
		this.cnNoteStatusId = cnNoteStatusId;
		this.cnNoteTypeId = cnNoteTypeId;
		this.cnNoteTitle = cnNoteTitle;
		this.cnNoteBody = cnNoteBody;
		this.cnNoteCreateTime = cnNoteCreateTime;
		this.cnNoteLastModifyTime = cnNoteLastModifyTime;
	}

	// Property accessors

	public String getCnNoteId() {
		return this.cnNoteId;
	}

	public void setCnNoteId(String cnNoteId) {
		this.cnNoteId = cnNoteId;
	}

	public String getCnNotebookId() {
		return this.cnNotebookId;
	}

	public void setCnNotebookId(String cnNotebookId) {
		this.cnNotebookId = cnNotebookId;
	}

	public String getCnUserId() {
		return this.cnUserId;
	}

	public void setCnUserId(String cnUserId) {
		this.cnUserId = cnUserId;
	}

	public String getCnNoteStatusId() {
		return this.cnNoteStatusId;
	}

	public void setCnNoteStatusId(String cnNoteStatusId) {
		this.cnNoteStatusId = cnNoteStatusId;
	}

	public String getCnNoteTypeId() {
		return this.cnNoteTypeId;
	}

	public void setCnNoteTypeId(String cnNoteTypeId) {
		this.cnNoteTypeId = cnNoteTypeId;
	}

	public String getCnNoteTitle() {
		return this.cnNoteTitle;
	}

	public void setCnNoteTitle(String cnNoteTitle) {
		this.cnNoteTitle = cnNoteTitle;
	}

	public String getCnNoteBody() {
		return this.cnNoteBody;
	}

	public void setCnNoteBody(String cnNoteBody) {
		this.cnNoteBody = cnNoteBody;
	}

	public long getCnNoteCreateTime() {
		return this.cnNoteCreateTime;
	}

	public void setCnNoteCreateTime(long cnNoteCreateTime) {
		this.cnNoteCreateTime = cnNoteCreateTime;
	}

	public long getCnNoteLastModifyTime() {
		return this.cnNoteLastModifyTime;
	}

	public void setCnNoteLastModifyTime(long cnNoteLastModifyTime) {
		this.cnNoteLastModifyTime = cnNoteLastModifyTime;
	}

}
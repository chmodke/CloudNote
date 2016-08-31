package org.kehao.note.model;

/**
 * CnNoteActivity entity. @author MyEclipse Persistence Tools
 */

public class CnNoteActivity implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -4720980241802867445L;
	private String cnNoteActivityId;
	private String cnActivityId;
	private String cnNoteId;
	private Integer cnNoteActivityUp;
	private Integer cnNoteActivityDown;
	private String cnNoteActivityTitle;
	private String cnNoteActivityBody;

	// Constructors

	/** default constructor */
	public CnNoteActivity() {
	}

	/** full constructor */
	public CnNoteActivity(String cnActivityId, String cnNoteId,
			Integer cnNoteActivityUp, Integer cnNoteActivityDown,
			String cnNoteActivityTitle, String cnNoteActivityBody) {
		this.cnActivityId = cnActivityId;
		this.cnNoteId = cnNoteId;
		this.cnNoteActivityUp = cnNoteActivityUp;
		this.cnNoteActivityDown = cnNoteActivityDown;
		this.cnNoteActivityTitle = cnNoteActivityTitle;
		this.cnNoteActivityBody = cnNoteActivityBody;
	}

	// Property accessors

	public String getCnNoteActivityId() {
		return this.cnNoteActivityId;
	}

	public void setCnNoteActivityId(String cnNoteActivityId) {
		this.cnNoteActivityId = cnNoteActivityId;
	}

	public String getCnActivityId() {
		return this.cnActivityId;
	}

	public void setCnActivityId(String cnActivityId) {
		this.cnActivityId = cnActivityId;
	}

	public String getCnNoteId() {
		return this.cnNoteId;
	}

	public void setCnNoteId(String cnNoteId) {
		this.cnNoteId = cnNoteId;
	}

	public Integer getCnNoteActivityUp() {
		return this.cnNoteActivityUp;
	}

	public void setCnNoteActivityUp(Integer cnNoteActivityUp) {
		this.cnNoteActivityUp = cnNoteActivityUp;
	}

	public Integer getCnNoteActivityDown() {
		return this.cnNoteActivityDown;
	}

	public void setCnNoteActivityDown(Integer cnNoteActivityDown) {
		this.cnNoteActivityDown = cnNoteActivityDown;
	}

	public String getCnNoteActivityTitle() {
		return this.cnNoteActivityTitle;
	}

	public void setCnNoteActivityTitle(String cnNoteActivityTitle) {
		this.cnNoteActivityTitle = cnNoteActivityTitle;
	}

	public String getCnNoteActivityBody() {
		return this.cnNoteActivityBody;
	}

	public void setCnNoteActivityBody(String cnNoteActivityBody) {
		this.cnNoteActivityBody = cnNoteActivityBody;
	}

}
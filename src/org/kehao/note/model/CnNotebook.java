package org.kehao.note.model;

import java.util.Date;

/**
 * CnNotebook entity. @author MyEclipse Persistence Tools
 */

public class CnNotebook implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -4271789670931541990L;
	private String cnNotebookId;
	private String cnUserId;
	private String cnNotebookTypeId;
	private String cnNotebookName;
	private String cnNotebookDesc;
	private Date cnNotebookCreatetime;

	// Constructors

	/** default constructor */
	public CnNotebook() {
	}

	/** minimal constructor */
	public CnNotebook(Date cnNotebookCreatetime) {
		this.cnNotebookCreatetime = cnNotebookCreatetime;
	}

	/** full constructor */
	public CnNotebook(String cnUserId, String cnNotebookTypeId,
			String cnNotebookName, String cnNotebookDesc,
			Date cnNotebookCreatetime) {
		this.cnUserId = cnUserId;
		this.cnNotebookTypeId = cnNotebookTypeId;
		this.cnNotebookName = cnNotebookName;
		this.cnNotebookDesc = cnNotebookDesc;
		this.cnNotebookCreatetime = cnNotebookCreatetime;
	}

	// Property accessors

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

	public String getCnNotebookTypeId() {
		return this.cnNotebookTypeId;
	}

	public void setCnNotebookTypeId(String cnNotebookTypeId) {
		this.cnNotebookTypeId = cnNotebookTypeId;
	}

	public String getCnNotebookName() {
		return this.cnNotebookName;
	}

	public void setCnNotebookName(String cnNotebookName) {
		this.cnNotebookName = cnNotebookName;
	}

	public String getCnNotebookDesc() {
		return this.cnNotebookDesc;
	}

	public void setCnNotebookDesc(String cnNotebookDesc) {
		this.cnNotebookDesc = cnNotebookDesc;
	}

	public Date getCnNotebookCreatetime() {
		return this.cnNotebookCreatetime;
	}

	public void setCnNotebookCreatetime(Date cnNotebookCreatetime) {
		this.cnNotebookCreatetime = cnNotebookCreatetime;
	}

}
package org.kehao.note.model;

import java.util.HashSet;
import java.util.Set;

/**
 * CnActivity entity. @author MyEclipse Persistence Tools
 */

public class CnActivity implements java.io.Serializable {
	private static final long serialVersionUID = -8550566510205068234L;
	private String cnActivityId;
	private String cnActivityTitle;
	private String cnActivityBody;
	private long cnActivityEndTime;
	private Set<CnActivityStatus> cnActivityStatuses = new HashSet<CnActivityStatus>(0);

	// Constructors

	/** default constructor */
	public CnActivity() {
	}

	/** full constructor */
	public CnActivity(String cnActivityTitle, String cnActivityBody,
			long cnActivityEndTime, Set<CnActivityStatus> cnActivityStatuses) {
		this.cnActivityTitle = cnActivityTitle;
		this.cnActivityBody = cnActivityBody;
		this.cnActivityEndTime = cnActivityEndTime;
		this.cnActivityStatuses = cnActivityStatuses;
	}

	// Property accessors

	public String getCnActivityId() {
		return this.cnActivityId;
	}

	public void setCnActivityId(String cnActivityId) {
		this.cnActivityId = cnActivityId;
	}

	public String getCnActivityTitle() {
		return this.cnActivityTitle;
	}

	public void setCnActivityTitle(String cnActivityTitle) {
		this.cnActivityTitle = cnActivityTitle;
	}

	public String getCnActivityBody() {
		return this.cnActivityBody;
	}

	public void setCnActivityBody(String cnActivityBody) {
		this.cnActivityBody = cnActivityBody;
	}

	public long getCnActivityEndTime() {
		return this.cnActivityEndTime;
	}

	public void setCnActivityEndTime(long cnActivityEndTime) {
		this.cnActivityEndTime = cnActivityEndTime;
	}

	public Set<CnActivityStatus> getCnActivityStatuses() {
		return this.cnActivityStatuses;
	}

	public void setCnActivityStatuses(Set<CnActivityStatus> cnActivityStatuses) {
		this.cnActivityStatuses = cnActivityStatuses;
	}

}
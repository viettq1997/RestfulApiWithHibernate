package com.demo.model;
// Generated Mar 2, 2019 4:10:03 PM by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Timesheet generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "TIMESHEET", schema = "c##nguyenquan")
public class Timesheet implements java.io.Serializable {

	private int idTs;
	private Project project;
	private Staff staff;
	private String task;
	private String times;
	private boolean results;
	private String note;
	private boolean status;

	public Timesheet() {
	}

	public Timesheet(int idTs, Project project, Staff staff, String task, String times, boolean results,
			boolean status) {
		this.idTs = idTs;
		this.project = project;
		this.staff = staff;
		this.task = task;
		this.times = times;
		this.results = results;
		this.status = status;
	}

	public Timesheet(int idTs, Project project, Staff staff, String task, String times, boolean results,
			String note, boolean status) {
		this.idTs = idTs;
		this.project = project;
		this.staff = staff;
		this.task = task;
		this.times = times;
		this.results = results;
		this.note = note;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "timesheet_seq")
	@SequenceGenerator(name = "timesheet_seq", sequenceName = "timesheet_seq")
	@Column(name = "ID_TS", unique = true, nullable = false, precision = 22, scale = 0)
	public int getIdTs() {
		return this.idTs;
	}

	public void setIdTs(int idTs) {
		this.idTs = idTs;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_PROJECT", nullable = false)
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_STAFF", nullable = false)
	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Column(name = "TASK", nullable = false, length = 225)
	public String getTask() {
		return this.task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Column(name = "TIMES", nullable = false, length = 225)
	public String getTimes() {
		return this.times;
	}

	public void setTimes(String times) {
		this.times = times;
	}

	@Column(name = "RESULTS", nullable = false, length = 225)
	public boolean getResults() {
		return this.results;
	}

	public void setResults(boolean results) {
		this.results = results;
	}

	@Column(name = "NOTE", length = 225)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "STATUS", nullable = false, precision = 1, scale = 0)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}

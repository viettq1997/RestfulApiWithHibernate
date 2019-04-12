package com.demo.model;
// Generated Mar 2, 2019 4:10:03 PM by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Project generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "PROJECT", schema = "c##nguyenquan")
public class Project implements java.io.Serializable {

	private int idProject;
	private String name;
	private Set<Timesheet> timesheets = new HashSet<Timesheet>(0);
	private Set<Reports> reportses = new HashSet<Reports>(0);
	private Set<Staff> staffs = new HashSet<Staff>(0);

	public Project() {
	}

	public Project(int idProject, String name) {
		this.idProject = idProject;
		this.name = name;
	}

	public Project(int idProject, String name, Set<Timesheet> timesheets, Set<Reports> reportses,
			Set<Staff> staffs) {
		this.idProject = idProject;
		this.name = name;
		this.timesheets = timesheets;
		this.reportses = reportses;
		this.staffs = staffs;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_seq")
	@SequenceGenerator(name = "project_seq", sequenceName = "project_seq")
	@Column(name = "ID_PROJECT", unique = true, nullable = false, precision = 22, scale = 0)
	public int getIdProject() {
		return this.idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	@Column(name = "NAME", nullable = false, length = 225)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	public Set<Timesheet> getTimesheets() {
		return this.timesheets;
	}

	public void setTimesheets(Set<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	public Set<Reports> getReportses() {
		return this.reportses;
	}

	public void setReportses(Set<Reports> reportses) {
		this.reportses = reportses;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	public Set<Staff> getStaffs() {
		return this.staffs;
	}

	public void setStaffs(Set<Staff> staffs) {
		this.staffs = staffs;
	}

}

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Bugs generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "BUGS", schema = "c##nguyenquan")
public class Bugs implements java.io.Serializable {

	private int idBugs;
	private Staff staff;
	private String names;
	private Set<Commentbugs> commentbugses = new HashSet<Commentbugs>(0);

	public Bugs() {
	}

	public Bugs(int idBugs, Staff staff, String names) {
		this.idBugs = idBugs;
		this.staff = staff;
		this.names = names;
	}

	public Bugs(int idBugs, Staff staff, String names, Set<Commentbugs> commentbugses) {
		this.idBugs = idBugs;
		this.staff = staff;
		this.names = names;
		this.commentbugses = commentbugses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bugs_seq")
	@SequenceGenerator(name = "bugs_seq", sequenceName = "bugs_seq")
	@Column(name = "ID_BUGS", unique = true, nullable = false, precision = 22, scale = 0)
	public int getIdBugs() {
		return this.idBugs;
	}

	public void setIdBugs(int idBugs) {
		this.idBugs = idBugs;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_STAFF", nullable = false)
	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Column(name = "NAMES", nullable = false, length = 225)
	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bugs")
	public Set<Commentbugs> getCommentbugses() {
		return this.commentbugses;
	}

	public void setCommentbugses(Set<Commentbugs> commentbugses) {
		this.commentbugses = commentbugses;
	}

}

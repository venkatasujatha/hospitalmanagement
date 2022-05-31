package com.tectoro.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Doctor {
	@Id
	private int id;
	private String dname;
	private String designation;
	private long phoneno;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="pateid")
	private List<patient> patient;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public List<patient> getPatient() {
		return patient;
	}
	public void setPatient(List<patient> patient) {
		this.patient = patient;
	}
	public Doctor(int id, String dname, String designation, long phoneno, List<com.tectoro.Model.patient> patient) {
		super();
		this.id = id;
		this.dname = dname;
		this.designation = designation;
		this.phoneno = phoneno;
		this.patient = patient;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", dname=" + dname + ", designation=" + designation + ", phoneno=" + phoneno
				+ ", patient=" + patient + "]";
	}
	
		

}

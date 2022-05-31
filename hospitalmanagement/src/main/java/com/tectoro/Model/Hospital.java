package com.tectoro.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	private int id;
	private String hname;
	private String address;
	private long phoneno;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="docid")
	private List<Doctor> doctor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public List<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}

	public Hospital(int id, String hname, String address, long phoneno, List<Doctor> doctor) {
		super();
		this.id = id;
		this.hname = hname;
		this.address = address;
		this.phoneno = phoneno;
		this.doctor = doctor;
	}

	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", hname=" + hname + ", address=" + address + ", phoneno=" + phoneno + ", doctor="
				+ doctor + "]";
	}
	
		
}

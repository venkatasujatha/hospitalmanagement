package com.tectoro.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Disease {
	@Id
	private int did;
	private String dname;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="medid")
	private List<Medicine> medicine;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Medicine> getMedicine() {
		return medicine;
	}

	public void setMedicine(List<Medicine> medicine) {
		this.medicine = medicine;
	}

	public Disease(int did, String dname, List<Medicine> medicine) {
		super();
		this.did = did;
		this.dname = dname;
		this.medicine = medicine;
	}

	public Disease() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Disease [did=" + did + ", dname=" + dname + ", medicine=" + medicine + "]";
	}
	
	
}

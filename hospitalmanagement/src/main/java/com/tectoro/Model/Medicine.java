package com.tectoro.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Medicine {
	@Id
	private int mid;
	private String mname;
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Medicine(int mid, String mname) {
		super();
		this.mid = mid;
		this.mname = mname;
	}
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Medicine [mid=" + mid + ", mname=" + mname + "]";
	}
	

}

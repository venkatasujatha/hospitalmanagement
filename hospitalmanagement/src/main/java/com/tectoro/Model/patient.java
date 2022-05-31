package com.tectoro.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class patient {
	@Id
	private int id;
	private String pname;
	private int age;
	private long phoneno;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="diseid")
	private List<Disease> disease;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public List<Disease> getDisease() {
		return disease;
	}

	public void setDisease(List<Disease> disease) {
		this.disease = disease;
	}

	public patient(int id, String pname, int age, long phoneno, List<Disease> disease) {
		super();
		this.id = id;
		this.pname = pname;
		this.age = age;
		this.phoneno = phoneno;
		this.disease = disease;
	}

	public patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "patient [id=" + id + ", pname=" + pname + ", age=" + age + ", phoneno=" + phoneno + ", disease="
				+ disease + "]";
	}
	
	
}

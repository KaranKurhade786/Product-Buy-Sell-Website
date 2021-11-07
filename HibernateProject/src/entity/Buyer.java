package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Buyer {
	@Id
	@Column(name="srno")
	private int srno;
	@Column(name="name")
	
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="age")
	private int age;
	@Column(name="amt")
	private double amt;
	@Column(name="cdno")
	private int cdno;
	
	public int getCdno() {
		return cdno;
	}
	public void setCdno(int cdno) {
		this.cdno = cdno;
	}
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
		this.srno = srno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}

	
}

package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="srno")
	private int srno;
	
	
	@Column(name="prodid")
	  private String prodid;
	
	@Column(name="prodnm")
	  private String prodnm;
	
	@Column(name="category")
	private String category;
	
	@Column(name="salesperson")
	private String salesperson;
	
	@Column(name="prices")
	private double prices;
	
	public int getSrno() {
		return srno;
	}
	
	public void setSrno(int srno) {
		this.srno = srno;
	}
	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
		this.prodid = prodid;
	}
	public String getProdnm() {
		return prodnm;
	}
	public void setProdnm(String prodnm) {
		this.prodnm = prodnm;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSalesperson() {
		return salesperson;
	}
	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}
	public double getPrices() {
		return prices;
	}
	public void setPrices(double prices) {
		this.prices = prices;
	}


	
}

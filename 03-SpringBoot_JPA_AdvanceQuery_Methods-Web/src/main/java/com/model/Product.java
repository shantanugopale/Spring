package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int pId;
	private String pName;
	private String pCategeory;
	private Double pPrice;
	public int getpId() {
		return pId;
	}
	
	public Product(int pId, String pName, String pCategeory, Double pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCategeory = pCategeory;
		this.pPrice = pPrice;
	}

	public Product() {
		super();
	}

	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCategeory() {
		return pCategeory;
	}
	public void setpCategeory(String pCategeory) {
		this.pCategeory = pCategeory;
	}
	public Double getpPrice() {
		return pPrice;
	}
	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pCategeory=" + pCategeory + ", pPrice=" + pPrice + "]\n\n";
	}
}

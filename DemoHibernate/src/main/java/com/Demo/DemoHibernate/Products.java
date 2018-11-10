package com.Demo.DemoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
	private int pSerialNumber;
	private  String pName;
	private  double pPrice;
	private   int pQuantity;
	
	public int getpSerialNumber() {
		return pSerialNumber;
	}
	public void setpSerialNumber(int pSerialNumber) {
		this.pSerialNumber = pSerialNumber;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public int getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}

}

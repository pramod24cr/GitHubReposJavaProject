package com.lti.demo;

public class Product 
{
	private int prdID;
	private String prdName;
	private  int prdCost;
	

	Product (int prdID, String prdName, int prdCost)
	{}
	public int getPrdID() {
		return prdID;
	}
	public void setPrdID(int prdID) {
		this.prdID = prdID;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public int getPrdCost() {
		return prdCost;
	}
	public void setPrdCost(int prdCost) {
		this.prdCost = prdCost;
	}
}

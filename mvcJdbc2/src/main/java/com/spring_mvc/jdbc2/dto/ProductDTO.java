package com.spring_mvc.jdbc2.dto;

public class ProductDTO {
	private String prdNo;
	private String prdName;
	private int prdPrice;
	private int prdStock;
	
	public ProductDTO() {
		
	}

	public ProductDTO(String prdNo, String prdName, int prdPrice, int prdStock) {
		super();
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdStock = prdStock;
	}

	public String getPrdNo() {
		return prdNo;
	}

	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public int getPrdPrice() {
		return prdPrice;
	}

	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}

	public int getPrdStock() {
		return prdStock;
	}

	public void setPrdStock(int prdStock) {
		this.prdStock = prdStock;
	}
}

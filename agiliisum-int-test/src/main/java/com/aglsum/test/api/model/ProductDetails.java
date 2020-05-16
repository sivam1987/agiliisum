package com.aglsum.test.api.model;

public class ProductDetails {
	
	private long prodCode;
	private String prodName;
	private String prodCatgory;
	
	public ProductDetails(long prodCode, String prodName, String prodCatgory) {
		super();
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.prodCatgory = prodCatgory;
	}

	public long getProdCode() {
		return prodCode;
	}

	public void setProdCode(long prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdCatgory() {
		return prodCatgory;
	}

	public void setProdCatgory(String prodCatgory) {
		this.prodCatgory = prodCatgory;
	}

	@Override
	public String toString() {
		return "ProductDetails [prodCode=" + prodCode + ", prodName=" + prodName + ", prodCatgory=" + prodCatgory + "]";
	}
	
	

}

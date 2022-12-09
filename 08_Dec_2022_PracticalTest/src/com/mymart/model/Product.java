package com.mymart.model;

import java.util.Objects;

public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	
	public Product(int prId,String prName, double prprice) {
		super();
		this.productId=prId;
		this.productName =prName;
		this.productPrice=prprice;
		//System.out.println("Product Id is:"+productId);
		//System.out.println("Product Id is:"+productName);
		//System.out.println("Product Id is:"+productPrice);
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int prId) {
		this.productId=prId;
	}
	public String  getProductName() {
		return productName;
	}
	public void setProductName(String prName) {
		this.productName = prName;
	}
	public double  getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double prPrice) {
		this.productPrice = prPrice;
	}
	public Product() {
		super();
	}

	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId, productName, productPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return productId == other.productId && Objects.equals(productName, other.productName)
				&& Double.doubleToLongBits(productPrice) == Double.doubleToLongBits(other.productPrice);
	}

}

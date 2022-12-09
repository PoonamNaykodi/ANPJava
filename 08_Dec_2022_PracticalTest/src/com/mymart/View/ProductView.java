package com.mymart.View;

import java.util.LinkedList;

import com.mymart.Service.ProductService;
import com.mymart.model.Product;

public class ProductView {
	private static ProductService productservice=new ProductService();
	
	public void addproduct() {
		int pId=1;
		String pName="poo";
		double pPrice=80000;
		Product product1=new Product(pId,pName,pPrice);
		Product product2=new Product(2,"Dell",90000);
		productservice.addProductServices(product1);
		productservice.addProductServices(product2);
	}
	public void displayAllProducts() {
		LinkedList<Product>product=productservice.getallproductservices();
		for (Product p:product) {
			System.out.println("*****Product Details*****");
			System.out.println("Product Id:"+p.getProductId());
			System.out.println("Product Name:"+p.getProductName());
			System.out.println("Product Price:"+p.getProductPrice());
		}
	}
}

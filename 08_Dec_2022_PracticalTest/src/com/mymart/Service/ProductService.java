package com.mymart.Service;

import java.util.LinkedList;

import com.mymart.Dao.ProductDao;
import com.mymart.model.Product;

public class ProductService {
	private static ProductDao productdao=new ProductDao();
	public boolean addProductServices(Product product) {
		boolean addstatus=ProductDao.addproduct(product);
		return addstatus;
	}
	public LinkedList<Product>getallproductservices(){
		LinkedList<Product> list=ProductDao.getallproduct();
		return list;
	}
}

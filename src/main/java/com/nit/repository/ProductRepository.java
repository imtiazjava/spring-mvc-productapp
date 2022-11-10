package com.nit.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nit.model.Product;

@Repository
public class ProductRepository {

	private List<Product> listProduct;
	
 
	
	public ProductRepository() {
		System.out.println("productrepository object is created..");
		this.listProduct=new ArrayList<>();
	}
	
	public List<Product> getAllProducts(){
		return this.listProduct;
	}
	
	public void addProduct(Product product) {
		this.listProduct.add(product);
	}

	public boolean deleteProduct(int id) {
		Product product=null;
		 for(int i=0;i<this.listProduct.size();i++) {
			   Product pr=listProduct.get(i);
			   if(pr.getPid()==id) {
				   product=pr;
				   break;
			   }
		 }
		 this.listProduct.remove(product);
		 return true;
	}
}

package com.springecommerce.dao;

import java.util.List;

import com.springecommerce.model.Product;

public interface ProductDao {
	
	public void insertProduct(Product product);
	
	public List<Product> getAllProducts(String productcat);
	
	public Product getProductById(int id);
}

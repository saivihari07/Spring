package com.springecommerce.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springecommerce.model.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void insertProduct(Product product) {
		this.hibernateTemplate.save(product);
	}

	// get all products
	public List<Product> getAllProducts(String productcat) {
		
		List<Product> list = (List<Product>) this.hibernateTemplate
				.findByNamedParam("from Product where productcat=:productcat", "productcat", productcat);
		return list;
	}
	
	public Product getProductById(int id) {
		return this.hibernateTemplate.get(Product.class,id);
	}
}

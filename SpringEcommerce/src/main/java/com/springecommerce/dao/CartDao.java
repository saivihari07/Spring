package com.springecommerce.dao;

import java.util.List;

import com.springecommerce.model.Cart;
import com.springecommerce.model.Product;


public interface CartDao {
	
	public Cart getCartById(int id);
	
	public List<Cart> cartList(String username);
	
	public void saveCart(Product product ,String username) ;
	
	
}

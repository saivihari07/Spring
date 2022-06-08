package com.springecommerce.dao;

import java.util.List;

import com.springecommerce.model.Cart;
import com.springecommerce.model.Orders;
import com.springecommerce.model.Product;

public interface OrderDao {
	
	public void saveOrder(Cart cart, String username);
	
	public void deleteCart(int id);
	
	public void deleteOrder(int id);
	
	public List<Orders> orderList(String username);
}

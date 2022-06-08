package com.springecommerce.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springecommerce.model.Cart;
import com.springecommerce.model.Orders;
import com.springecommerce.model.Product;
@Repository
@Transactional
public class OrderDaoImpl implements OrderDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void saveOrder(Cart cart, String username) {
		Orders ord = new Orders();
		ord.setUsername(username);
		ord.setProductid(cart.getProductid());
		ord.setProductname(cart.getProductname());
		ord.setProductdesc(cart.getProductdesc());
		ord.setProductprice(cart.getProductprice());
		ord.setProducturl(cart.getProducturl());
		ord.setProductcat(cart.getProductcat());
		this.hibernateTemplate.save(ord);
	}

	@Override
	public void deleteCart(int id) {

		Cart cart = this.hibernateTemplate.get(Cart.class, id);
		this.hibernateTemplate.delete(cart);
	}

	@Override
	public void deleteOrder(int id) {

		Orders order = this.hibernateTemplate.get(Orders.class, id);
		this.hibernateTemplate.delete(order);
	}

	@Override
	public List<Orders> orderList(String username) {
		return (List<Orders>) this.hibernateTemplate.findByNamedParam("from Orders where username=:username",
				"username", username);
	}

}
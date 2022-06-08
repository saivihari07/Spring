package com.springecommerce.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springecommerce.model.Cart;
import com.springecommerce.model.Product;

@Repository
@Transactional
public class CartDaoImpl implements CartDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List<Cart> cartList(String username) {
		return (List<Cart>) this.hibernateTemplate.findByNamedParam("from Cart where username=:username", "username",
				username);

	}

	@Override
	public Cart getCartById(int id) {
		return this.hibernateTemplate.get(Cart.class, id);

	}

	@Override
	public void saveCart(Product product, String username) {
		Cart ct = new Cart();
		ct.setUsername(username);
		ct.setProductid(product.getProductid());
		ct.setProductname(product.getProductname());
		ct.setProductdesc(product.getProductdesc());
		ct.setProductprice(product.getProductprice());
		ct.setProducturl(product.getProducturl());
		ct.setProductcat(product.getProductcat());
		this.hibernateTemplate.save(ct);
	}

}

package com.springecommerce.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springecommerce.dao.CartDao;
import com.springecommerce.dao.OrderDao;
import com.springecommerce.dao.ProductDao;
import com.springecommerce.model.Cart;
import com.springecommerce.model.Orders;
import com.springecommerce.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private OrderDao orderDao;
	
	@RequestMapping("/addProducts")
	public String addProduct(@ModelAttribute("product") Product product) {
		return "productForm";
	}
	
	@RequestMapping(value="/productProcess",method = RequestMethod.POST)
	public String productProcessForm(@Valid @ModelAttribute("product") Product product,BindingResult result,Model model) {
		model.addAttribute("product",product);
		if(result.hasErrors()) {
			return "productForm";
		}
		productDao.insertProduct(product);
		return "product-success";
		
	}
	
	
	@RequestMapping("/plp/{cat}")
	public String showCat(@PathVariable("cat") String cat ,Model m) {
		
		List<Product> list= productDao.getAllProducts(cat);
		m.addAttribute("list", list);
		
		return "plp-page";
		
	}
	
	@RequestMapping("/pdp/{id}")
	public String showProduct(@PathVariable("id") int id,Model m) {
		Product product = productDao.getProductById(id);
		m.addAttribute("product",product);
		return "pdp-page";
	} 
	
	@RequestMapping("/cart/{id}")
	public String showCart(@PathVariable("id") int id,Model m,Principal p) {
		String username = p.getName();
		Product product = productDao.getProductById(id);
		cartDao.saveCart(product, username);
		List<Cart> list = cartDao.cartList(username);
		m.addAttribute("carts",list);
		return "viewcart";
	}
	@RequestMapping("/viewcart")
	public String cartPage(Model m,Principal p) {
		String username = p.getName();
		List<Cart> list = cartDao.cartList(username);
		m.addAttribute("carts",list);
		return "viewcart";
	}
	
	@RequestMapping("/remove/{id}")
	public String removeFromCart(@PathVariable("id") int id,Model m,Principal p) {
		String username = p.getName();
		orderDao.deleteCart(id);
		List<Cart> list = cartDao.cartList(username);
		m.addAttribute("carts",list);
		return "viewcart";
	}
	@RequestMapping("/order/{id}")
	public String showOrders(@PathVariable("id") int id,Model m,Principal p) {
		String username = p.getName();
		Cart cart = cartDao.getCartById(id);
		orderDao.saveOrder(cart, username);
		orderDao.deleteCart(id);
		List<Orders> list = orderDao.orderList(username);
		m.addAttribute("ords",list);
		return "order-page";
	}
	@RequestMapping("/order")
	public String orderPage(Model m,Principal p) {
		String username = p.getName();
		System.out.println("thhshdfjhafjgasdfg");
		List<Orders> list = orderDao.orderList(username);
		m.addAttribute("ords",list);
		return "order-page";
	}
	@RequestMapping("/remove-order/{id}")
	public String removeFromOrder(@PathVariable("id") int id,Model m,Principal p) {
		String username = p.getName();
		orderDao.deleteOrder(id);
		List<Orders> list = orderDao.orderList(username);
		m.addAttribute("ords",list);
		return "order-page";
	}
}

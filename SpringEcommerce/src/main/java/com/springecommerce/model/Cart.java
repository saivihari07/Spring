package com.springecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Cart {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)    
private int id;
	
	@NotEmpty
	@Size(min=6,max=50)
	private String productname;
	
	
	
	private int productprice,productid;
	
	
	private String producturl;
	
	@NotEmpty
	private String productdesc;
	

	private String productcat;

	private String username;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getProductname() {
		return productname;
	}



	public void setProductname(String productname) {
		this.productname = productname;
	}



	public int getProductprice() {
		return productprice;
	}



	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}



	public int getProductid() {
		return productid;
	}



	public void setProductid(int productid) {
		this.productid = productid;
	}



	public String getProducturl() {
		return producturl;
	}



	public void setProducturl(String producturl) {
		this.producturl = producturl;
	}



	public String getProductdesc() {
		return productdesc;
	}



	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}



	public String getProductcat() {
		return productcat;
	}



	public void setProductcat(String productcat) {
		this.productcat = productcat;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	@Override
	public String toString() {
		return "Cart [productid=" + productid + ", productname=" + productname + ", productprice=" + productprice
				+ ", producturl=" + producturl + ", productdesc=" + productdesc + ", productcat=" + productcat + "]";
	}
	
	
	
}

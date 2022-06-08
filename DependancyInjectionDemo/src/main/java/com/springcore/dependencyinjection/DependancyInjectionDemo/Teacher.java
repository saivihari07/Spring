package com.springcore.dependencyinjection.DependancyInjectionDemo;

public class Teacher {
	
	private String name;
	private String Address;
	private Pen tpen;
	
	
	
	public Pen getTpen() {
		return tpen;
	}
	public void setTpen(Pen tpen) {
		this.tpen = tpen;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", Address=" + Address + ", tpen=" + tpen + "]";
	}
	
	
	
}

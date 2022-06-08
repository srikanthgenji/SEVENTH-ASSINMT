package com.myfirstpackage.entity;

import java.util.Date;

public class OrderLine {
	private Item item;
	private Date ETA;
	private Status orderLinestatus;
	private Address address;
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Date getETA() {
		return ETA;
	}
	public void setETA(Date eTA) {
		ETA = eTA;
	}
	public Status getOrderLinestatus() {
		return orderLinestatus;
	}
	public void setOrderLinestatus(Status orderLinestatus) {
		this.orderLinestatus = orderLinestatus;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	} 
	

}

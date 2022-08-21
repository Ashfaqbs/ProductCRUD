package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {


	public Product(int pid, String pname, String pDecspt, long price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pDecspt = pDecspt;
		this.price = price;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;

	private String pname;

	private String pDecspt;


	private long price;


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getpDecspt() {
		return pDecspt;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setpDecspt(String pDecspt) {
		this.pDecspt = pDecspt;
	}


	public long getPrice() {
		return price;
	}


	public void setPrice(long price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pDecspt=" + pDecspt + ", price=" + price + "]";
	}




}

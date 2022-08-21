package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.model.Product;

@Repository
public class MainDao {



	@Autowired
	private HibernateTemplate temp;	

	//create
	@Transactional
	public void addproduct(Product prod)
	{
		this.temp.saveOrUpdate(prod);
	}

	//get all products
	public List<Product> getProd()
	{
		List<Product> pr=this.temp.loadAll(Product.class);
		return pr;
	}

	//delete a single product

	@Transactional
	public void deleteProd(int pid)
	{

		Product pr=	this.temp.load(Product.class, pid);
		this.temp.delete(pr);
	}


	public Product getproduct(int id )
	{
		Product pr =	this.temp.get(Product.class, id);
		return pr;
	}



}

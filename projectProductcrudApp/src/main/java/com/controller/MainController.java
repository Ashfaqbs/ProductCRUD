package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.MainDao;
import com.model.Product;
import com.sun.org.apache.regexp.internal.recompile;
import com.sun.org.apache.xpath.internal.operations.Mod;

@Controller
public class MainController {

	@Autowired
	private MainDao maindao;	

	@RequestMapping("/")
	public String home(Model m)
	{
		List<Product> prods	=this.maindao.getProd();
		m.addAttribute("prods",prods);
		return "index";
	}


	//	show add product form
	@RequestMapping("/addprod")
	public String addProd(Model m)
	{
		m.addAttribute("title", "Add Product");

		return "add_prod";
	}

	//	handleporduct
	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleprod(@ModelAttribute Product product,Model m,HttpServletRequest req)
	{
		RedirectView v = new  RedirectView();
		v.setUrl(req.getContextPath()+"/");
		System.out.println(product);

		this.maindao.addproduct(product);

		return v;
	}



	@RequestMapping("/delete/{id}")
	public RedirectView deleteprod(@PathVariable("id")int id, HttpServletRequest req)
	{
		RedirectView v = new RedirectView();
		this.maindao.deleteProd(id);
		v.setUrl(req.getContextPath()+"/");
		return v;
	}

	@RequestMapping("/update/{id}")
	public String update(@PathVariable("id") int id , Model m)
	{
		Product pr=	this.maindao.getproduct(id);
		m.addAttribute("product",pr);
		
		return "update";
	}




}

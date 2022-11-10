package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nit.model.Product;
import com.nit.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String indexPage(Model model) {
		model.addAttribute("command", new Product());
		return "index";
	}
	
	@RequestMapping(value="/all",method = RequestMethod.GET)
	public ModelAndView getAllProducts(){
		List<Product> list=this.productRepository.getAllProducts();
		ModelAndView mv=new ModelAndView("display", "list", list);
		return mv;
	}
	
	@RequestMapping(value="/store",method = RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute("product") Product product)
	{
		this.productRepository.addProduct(product);
		List<Product> list=this.productRepository.getAllProducts();
		ModelAndView mv=new ModelAndView("display", "list", list);
		return mv;
		 
		 
	}
	
	@RequestMapping(value="/delete/{id}",method = RequestMethod.GET)
	public String deleteProduct(@PathVariable("id") int id) {
		this.productRepository.deleteProduct(id);
		 return "./display";
		 
	}
}

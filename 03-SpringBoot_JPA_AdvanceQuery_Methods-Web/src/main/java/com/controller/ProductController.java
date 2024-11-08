package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Product;
import com.service.IProductService;

@Controller
public class ProductController {
	
	@Autowired
	private IProductService service;
	
	@RequestMapping("/")
	public String landingPage(Model model)
	{
		List<Product> pList = service.getAllData();
		
		model.addAttribute("data", pList);
		return "index";
	}
}

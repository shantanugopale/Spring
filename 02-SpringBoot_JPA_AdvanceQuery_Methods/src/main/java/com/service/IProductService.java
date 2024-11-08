package com.service;

import java.util.List;

import com.model.Product;

public interface IProductService {
	
	List<Product> getAllData();
	List<Product> getFirstPage();
	List<Product> getSecondPage();
	List<Product> lowToHigh();
	
}

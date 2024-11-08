package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dao.ProductRepository;
import com.model.Product;

@Service
public class ProductServiceIMPL implements IProductService {

	@Autowired
	private ProductRepository repo;

	@Override
	public List<Product> getAllData() {

		return repo.findAll();
	}

	@Override
	public List<Product> getFirstPage() {

		PageRequest request = PageRequest.of(0, 8);
		Page page = repo.findAll(request);

		return page.getContent();
	}

	@Override
	public List<Product> getSecondPage() {

		PageRequest request = PageRequest.of(1, 8);
		Page page = repo.findAll(request);

		return page.getContent();
	}

	@Override
	public List<Product> lowToHigh() {
		PageRequest request = PageRequest.of(0, 20, Sort.by("pPrice").descending());
		Page<Product> page = repo.findAll(request);
		return page.getContent();
	}

}

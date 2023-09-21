package com.bakserhub.the.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bakserhub.the.domain.Product;
import com.bakserhub.the.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;

	public List<Product> listProducts() {
		return productRepo.listProducts();
	}

	public Product getProduct(String id) {
		return productRepo.getProduct(id);
	}
}

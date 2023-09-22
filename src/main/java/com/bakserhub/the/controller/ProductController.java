package com.bakserhub.the.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakserhub.the.domain.Product;
import com.bakserhub.the.domain.ProductCategory;
import com.bakserhub.the.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping()
	public ResponseEntity<List<Product>> listProducts() {
		var response = productService.listProducts();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable(value = "id") String id) {
		var response = productService.getProduct(id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/category")
	public ResponseEntity<List<ProductCategory>> listCategory() {
		var response = productService.listCategories();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}

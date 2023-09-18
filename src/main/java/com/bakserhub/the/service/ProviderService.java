package com.bakserhub.the.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bakserhub.the.domain.Product;
import com.bakserhub.the.dto.ProductCreationRequest;
import com.bakserhub.the.repo.ProviderRepo;

@Service
public class ProviderService {

	@Autowired
	ProviderRepo providerRepo;

	public String saveProduct(ProductCreationRequest productCreationRequest) {
		var product = buildProduct(productCreationRequest);
		providerRepo.saveProduct(product);
		return "Product Added Successfully";
	}

	private Product buildProduct(ProductCreationRequest productCreationRequest) {
		var product = Product.builder().name(productCreationRequest.getName())
				.category(productCreationRequest.getCategory()).subCategory(productCreationRequest.getSubCategory())
				.description(productCreationRequest.getDescription())
				.shortDescription(productCreationRequest.getShortDescription()).price(productCreationRequest.getPrice())
				.stock(productCreationRequest.getStock()).primaryImage(productCreationRequest.getPrimaryImage())
				.secondaryImages(productCreationRequest.getSecondaryImages()).createdAt(new Date())
				.updatedAt(new Date()).build();
		return product;
	}
}

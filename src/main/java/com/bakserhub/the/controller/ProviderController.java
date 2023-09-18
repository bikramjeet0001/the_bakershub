package com.bakserhub.the.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakserhub.the.dto.ProductCreationRequest;
import com.bakserhub.the.service.ProviderService;

@RestController
@CrossOrigin
@RequestMapping("/provider")
public class ProviderController {

	@Autowired
	ProviderService providerService;

	@PostMapping("/product")
	public ResponseEntity<?> saveProduct(@RequestBody ProductCreationRequest productCreationRequest) {
		var response = providerService.saveProduct(productCreationRequest);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}

package com.bakserhub.the.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.bakserhub.the.domain.Product;

@Repository
public class ProviderRepo {

	@Autowired
	MongoTemplate mongoTemplate;

	public void saveProduct(Product product) {
		mongoTemplate.save(product);

	}

}

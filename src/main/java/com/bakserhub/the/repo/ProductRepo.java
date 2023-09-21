package com.bakserhub.the.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.bakserhub.the.domain.Product;

@Repository
public class ProductRepo {

	@Autowired
	MongoTemplate mongoTemplate;

	public List<Product> listProducts() {
		return mongoTemplate.findAll(Product.class);
	}

	public Product getProduct(String productId) {
		var query = new Query(Criteria.where("_id").is(productId));
		return mongoTemplate.findOne(query, Product.class);
	}

}

package com.bakserhub.the.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.bakserhub.the.domain.ProductCategory;

@Repository
public class ProductCategoryRepo {

	@Autowired
	MongoTemplate mongoTemplate;

	public List<ProductCategory> listCategories() {
		return mongoTemplate.findAll(ProductCategory.class);
	}
}

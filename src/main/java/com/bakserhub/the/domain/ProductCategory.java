package com.bakserhub.the.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "product_category")
@Builder
public class ProductCategory {
	
	@Id
	private String id;
	private String name;
	private String image;
	

}

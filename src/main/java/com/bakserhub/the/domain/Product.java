package com.bakserhub.the.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "product")
public class Product {

	@Id
	private String id;
	private String name;
	private double price;
	private String category;
	private String subCategory;
	private String description;
	private String shortDescription;
	private int stock;
	private List<Rating> rating;
	@JsonProperty("primary_image")
	private String primaryImage;

	@JsonProperty("secondary_images")
	private List<String> secondaryImages;
	private Date createdAt;
	private Date updatedAt;
}

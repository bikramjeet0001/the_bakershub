package com.bakserhub.the.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ProductCreationRequest {

	private String name;
	private double price;
	private String category;
	private String subCategory;
	private String description;
	private String shortDescription;
	private int stock;
	@JsonProperty("primary_image")
	private String primaryImage;

	@JsonProperty("secondary_images")
	private List<String> secondaryImages;
}

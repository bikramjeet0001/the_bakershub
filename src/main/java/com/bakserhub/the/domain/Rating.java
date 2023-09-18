package com.bakserhub.the.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Rating {

	private int rating;
	private String review;
	private Date date;

}

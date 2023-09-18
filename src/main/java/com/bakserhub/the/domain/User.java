package com.bakserhub.the.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "user")
public class User {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String name;
	private String phone;
	private String email;
	private List<Address> address;
	private String userType;
	private Date createdAt;
	private Date updatedAt;

}

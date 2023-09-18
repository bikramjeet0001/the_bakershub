package com.bakserhub.the.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.bakserhub.the.domain.User;

@Repository
public class UserRepo {

	@Autowired
	MongoTemplate mongoTemplate;

	public List<User> listUser() {
		return mongoTemplate.findAll(User.class);
	}

	public User getUser(String userId) {
		var query = new Query(Criteria.where("_id").is(userId));
		return mongoTemplate.findOne(query, User.class);
	}

}

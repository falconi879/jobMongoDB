package com.andre.jobMongoDB.reposytories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.andre.jobMongoDB.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}

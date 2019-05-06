package com.github.marcosrafaellsousa.workshopmongo.repository;

import com.github.marcosrafaellsousa.workshopmongo.domain.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}

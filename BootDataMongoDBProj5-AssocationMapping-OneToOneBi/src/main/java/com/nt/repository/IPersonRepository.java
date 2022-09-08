package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Person;

public interface IPersonRepository extends MongoRepository<Person, Integer> {

}

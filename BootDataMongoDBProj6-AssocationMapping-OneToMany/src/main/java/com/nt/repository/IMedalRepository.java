package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Medal;

public interface IMedalRepository extends MongoRepository<Medal, Integer> {

}

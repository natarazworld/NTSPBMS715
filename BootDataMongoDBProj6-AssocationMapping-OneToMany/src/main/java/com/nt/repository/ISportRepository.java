package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Sport;

public interface ISportRepository extends MongoRepository<Sport, Integer> {

}

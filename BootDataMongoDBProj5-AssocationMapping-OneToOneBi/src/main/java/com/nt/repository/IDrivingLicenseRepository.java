package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.DrivingLicense;

public interface IDrivingLicenseRepository extends MongoRepository<DrivingLicense, Integer> {

}

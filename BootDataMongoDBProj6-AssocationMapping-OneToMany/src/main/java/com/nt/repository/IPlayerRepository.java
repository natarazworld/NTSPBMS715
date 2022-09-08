package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Player;

public interface IPlayerRepository extends MongoRepository<Player, Integer> {

}

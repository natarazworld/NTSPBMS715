//IActorRepository.java (Custom Repository)
package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Actor;

public interface IActorRepository extends CrudRepository<Actor, Integer> {

}

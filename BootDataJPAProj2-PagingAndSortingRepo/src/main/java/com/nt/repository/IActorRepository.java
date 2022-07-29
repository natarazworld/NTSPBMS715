//IActorRepository.java (Custom Repository)
package com.nt.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.Actor;

public interface IActorRepository extends PagingAndSortingRepository<Actor, Integer> {

}

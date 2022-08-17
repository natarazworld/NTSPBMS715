//IActorRepository.java
package com.nt.repository;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer> {

	
}



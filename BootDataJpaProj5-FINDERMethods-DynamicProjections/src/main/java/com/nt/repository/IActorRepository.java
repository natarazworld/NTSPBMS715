//IActorRepository.java
package com.nt.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Actor;
import com.nt.view.View;

public interface IActorRepository extends JpaRepository<Actor, Integer> {
	
	public  <T extends View>  Iterable<T>  findByCategoryContainingIgnoreCase(String letters,Class<T> clazz);
}

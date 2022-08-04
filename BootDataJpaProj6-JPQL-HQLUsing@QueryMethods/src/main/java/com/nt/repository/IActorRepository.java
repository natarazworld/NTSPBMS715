//IActorRepository.java
package com.nt.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.entity.Actor;


public interface IActorRepository extends JpaRepository<Actor, Integer> {
		
	  //@Query("from Actor where category=?1")
	    //@Query("from com.nt.entity.Actor a where a.category=?1")
	  // @Query("select a from com.nt.entity.Actor a where a.category=?1")
	   @Query(" from Actor   where category=:role")
	   public  Iterable<Actor>  searchActorsByCategory(String role);
	   
	   /*@Query(" from Actor   where category=:role")
	  public  Iterable<Actor>  searchActorsByCategory(@Param("role")String category); */
	  
}

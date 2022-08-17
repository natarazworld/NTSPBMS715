//IActorRepository.java
package com.nt.repository;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Actor;

@Transactional
public interface IActorRepository extends JpaRepository<Actor, Integer> {

	 @Query("update Actor set mobileNo=:newMobileNo where  aid=:id")
	 @Modifying
	public   int   updateActorMobileNoByAid(long newMobileNo, int id);
	 
	 @Query("delete from Actor  where  category=:role")
	 @Modifying
	 public  int  deleteActorsByCategory(String role);
}




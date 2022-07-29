//IActorRepository.java
package com.nt.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer> {
	   //select * from  data_jpa_actor where aname=?
      public  List<Actor>  findByAnameEquals(String name);
      
      //select * from  data_jpa_actor where aname = ?
      public  Iterable<Actor> findByAnameIs(String name);
      
      //select * from  data_jpa_actor where aname = ?
      public  Iterable<Actor> findByAname(String name);
      
      //select * from  data_jpa_actor where aid between  ? and ?
      public  Iterable<Actor>  findByAidBetween(int start, int end);
      
      //select * from  data_jpa_actor where upper(category)=upper(?)
      public  Iterable<Actor> findByCategoryEqualsIgnoreCase(String  category);
      
      //select * from  data_jpa_actor where  aname like  %?
    //select * from  data_jpa_actor where  aname like  ?%
      //select * from  data_jpa_actor where  aname like  %?%
      public   Iterable<Actor>  findByAnameLike(String chars);

      //select * from  data_jpa_actor where  aname like  ?%
      public  Iterable<Actor>  findByAnameStartingWith(String  startChars);
      //select * from  data_jpa_actor where  aname like  %?%
      public Iterable<Actor>  findByAnameContainingIgnoreCase(String chars);
}

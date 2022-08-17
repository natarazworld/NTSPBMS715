//IActorRepository.java
package com.nt.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer> {

	//Entity Query giving single record
	@Query("from Actor where mobileNo=:no")
	public  Actor    getActorByMobileNo(@Param("no")long mobileNo);
	
	//Scalar query giving  multiple specific col values of a single record
	@Query("select  aid,aname,category from Actor where mobileNo=:mno")
				public  Object   getActorDataByMobileNo(long  mno);
	
	//scalar query giving  specific single col value of a record
	@Query("select aname from Actor where mobileNo=:mno")
	  public   String    getActorNameByMobileNo(long mno);
	
	@Query("from Actor where aid=:id")
	public Optional<Actor> findById(Integer id);
	
	@Query("select count(*) from Actor where category=:role" )
	public   int  getActorsCount(String role);
	
	@Query("select count(*),max(aid),min(aid),sum(aid),avg(aid) from Actor" )
	public   Object  getActorsAggragateData();
	
	@Query(" from  Actor where aid=(select max(aid) from Actor)")
	public   Actor  getActorDataByMaxActorId();
}



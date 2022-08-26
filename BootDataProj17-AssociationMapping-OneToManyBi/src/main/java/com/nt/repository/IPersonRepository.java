//IPersonRepository.java
package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {
	 
	@Query("select p.pid,p.pname,p.paddrs,ph.regno,ph.phone_number,ph.number_type,ph.provider from Person p inner join p.phones ph")
	//@Query("select p.pid,p.pname,p.paddrs,ph.regno,ph.phone_number,ph.number_type,ph.provider from Person p right join p.phones ph")
	//@Query("select p.pid,p.pname,p.paddrs,ph.regno,ph.phone_number,ph.number_type,ph.provider from Person p left join p.phones ph")
	//@Query("select p.pid,p.pname,p.paddrs,ph.regno,ph.phone_number,ph.number_type,ph.provider from Person p full join p.phones ph")
	public  List<Object[]>  fetchDataUsingJoinsByParent();

	@Query("from Person p inner join fetch p.phones ph")
	public List<Person>  fetchData1UsingJoinsByParent();
}

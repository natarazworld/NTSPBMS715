//IPhoneNumberRepository.java
package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.PhoneNumber;

@Transactional
public interface IPhoneNumberRepository extends JpaRepository<PhoneNumber, Integer> {
	@Query(value="delete from Phone_numbers_otm where  person_id=:id ",nativeQuery = true)
	@Modifying
    public int  deleteAllPhoneNumbersOfaPersonByPid(int id);
}

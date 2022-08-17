//IAccountRepository.java
package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Account;

public interface IAccountRepository extends JpaRepository<Account, Long>{
	@Query("update Account set amount=amount-:amt where acno=:srcAcno")
	@Modifying
   public  int  withdrawMoney(long srcAcno, double amt);
	
	@Query("update Account set amount=amount+:amt where acno=:destAcno")
	@Modifying
   public  int  depositeMoney(long destAcno, double amt);
}


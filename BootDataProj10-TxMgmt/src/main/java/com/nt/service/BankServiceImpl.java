//BankServiceImpl.java
package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.repository.IAccountRepository;

@Service("bankService")
public class BankServiceImpl implements IBankService {
	@Autowired
	private  IAccountRepository  accountRepo;

	@Override
	@Transactional
	public String transferMoney(long srcAcno, long destAcno, double amount) {
		//use  Repository method
		int result1=accountRepo.withdrawMoney(srcAcno, amount);
		int result2=accountRepo.depositeMoney(destAcno, amount);
		if(result1==0 || result2==0)
			throw new RuntimeException("Problem in TransferMoney operation"); //must be unchecked exception
		
		return   "Money Transfered from "+srcAcno+" to "+destAcno +" amount ::"+amount;
	}

}

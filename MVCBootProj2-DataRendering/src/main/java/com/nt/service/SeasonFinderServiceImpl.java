//SeasonFinderServiceImpl.java (Service Impl class)
package com.nt.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service("seasonService")
public class SeasonFinderServiceImpl implements ISeasonFinderService {
	

	@Override
	public String findSeason() {
		//get System date 
		LocalDate ld=LocalDate.now();
		//  get current month
		int month=ld.getMonthValue();
		//find season
		if(month>=7 && month<=9)
			return "Rainy Season";
		else if(month>=3 && month<=6)
			return "Summer Season";
		else
			return "Winter Season";
		
	}

}

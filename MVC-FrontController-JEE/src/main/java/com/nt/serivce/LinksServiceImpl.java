//LinksServiceImpl.java
package com.nt.serivce;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class LinksServiceImpl implements ILinksService {
	
	@Override
	public String generateWishMessage() {
		 //get system date and time
		LocalDateTime ldt=LocalDateTime.now();
		// get current hour of the day
		 int hour=ldt.getHour();
		 if(hour<12)
			 return "good morning:";
		 else if(hour<16)
			 return "good after noon:";
		 else if(hour<20)
			 return "good evening:";
		 else
			 return " good night";
		
		
	}
	
	@Override
	public Set<String> fetchAllLanguages() {
	    Locale locales[]=Locale.getAvailableLocales();
	    Set<String>  langSet=new HashSet<String>();
	     for(Locale l: locales) {
	    	 langSet.add(l.getDisplayLanguage());
	     }
		return langSet;
	}

}

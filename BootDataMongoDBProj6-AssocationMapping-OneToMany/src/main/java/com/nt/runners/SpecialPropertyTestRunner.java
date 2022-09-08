package com.nt.runners;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Medal;
import com.nt.document.Player;
import com.nt.document.Sport;
import com.nt.service.IPlayerMgmtService;

@Component
public class SpecialPropertyTestRunner implements CommandLineRunner {
	@Autowired
	private IPlayerMgmtService  service;

	@Override
	public void run(String... args) throws Exception {
		/*Sport sp1=new Sport(new Random().nextInt(10000),
				                                   "cricket",
				                                   new String[] {"bat","ball","gloves","guard","..."},
				                                   "outdoor");		
		Sport sp2=new Sport(new Random().nextInt(10000),
		                                             "chess",
		                                         new String[] {"chess board","timer","..."},
		                                          "indoor");		
		Medal  m1=new Medal(new Random().nextInt(10000),
				                                     "MOM",
				                                     "Ind Vs Eng",
				                                     LocalDateTime.now());
		Medal  m2=new Medal(new Random().nextInt(20000),
		                                                "MOS",
		                                                "Ind - aus tour",
		                                                 LocalDateTime.of(2021,10,23,17,15,30));
		Player player =new Player(new Random().nextInt(30000),
				                                            "chahal",
				                                            "india",
				                                            LocalDateTime.of(1995,10,23,17,15,30),
				                                            Set.of(sp1,sp2),
				                                            Map.of("medal1",m1,"medal2",m2));
				                                           
				                                            
				                                      
		
		System.out.println(service.registerPlayer(player));*/
		
		 service.showPlayersInfo().forEach(player->{
			  System.out.println("parent ::"+player);
			  Set<Sport> childs1=player.getSportsInfo();
			  System.out.println("Sports Info (childs1)");
			    childs1.forEach(sp->{
			    	System.out.println(sp);
			    });
			    System.out.println("Medals  Info (childs2)");
			    Map<String,Medal> childs2=player.getMedalsInfo();
			    childs2.forEach((k,m)->{
			    	    System.out.println("medal Info::"+k);
			    	   System.out.println("Medla details ::"+m);
			    });
			 
			    
		 });
	}

}

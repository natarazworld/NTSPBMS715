//Crickter.java (target class) 
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource(value="classpath:com/nt/commons/Info.properties")
public abstract class Cricketer   {
	@Value("${cktr.name}")
	private String name;
	@Value("${cktr.jersyNo}")
	private  int jersyNo;
		
	public Cricketer() {
		System.out.println("Cricketer:: 0-param constructor");
	}
	
	public   void  fielding() {
		System.out.println(name+"  with jersyNo :: "+jersyNo+" is fielding");
	}
	
	public   void  bowling() {
		System.out.println(name+"  with  jersyNo ::"+jersyNo+" is bowling");
	}
	
	public   void  wicketKeeping() {
		System.out.println(name+" with jersyNo :: "+jersyNo+" is keeping the wickets");
	}
	
	public  void  batting() {
		 //get  Dependnet class obj
		  CricketBat  bat=getBat();
		 // invoke the b.methods
		 int runs=bat.scoreRuns();
		 System.out.println(name+"with  Jersy no"+jersyNo+" has scored  "+runs+" runs");
	}
	
	
	  @Lookup
	  public   abstract   CricketBat   getBat();

}

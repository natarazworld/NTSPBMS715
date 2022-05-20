//Crickter.java (target class) 
package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource(value="classpath:com/nt/commons/Info.properties")
public class Cricketer    implements ApplicationContextAware{
	@Value("${cktr.name}")
	private String name;
	@Value("${cktr.jersyNo}")
	private  int jersyNo;
	
	 @Autowired
	private ApplicationContext ctx;
	
		@Override
		public void setApplicationContext(ApplicationContext ctx) throws BeansException {
			System.out.println("Cricketer.setApplicationContext()");
	     this.ctx=ctx;		
		}
		
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
		 //  perform  depedency lookup to get Bat object (Dependent class obj)
		 // CricketBat bat=ctx.getBean("bat",CricketBat.class);  //lookup with dependent bean id
		     CricketBat  bat=ctx.getBean(CricketBat.class);   // lookup with Dependent class name
		 // invoke the b.methods
		 int runs=bat.scoreRuns();
		 System.out.println(name+"with "+jersyNo+" has scored  "+runs+" runs");

	}

	

}

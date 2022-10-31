//TimeCheckingHandlerInterceptor.java
package com.nt.interceptor;
import java.time.LocalDateTime;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class TimeCheckingJHandlerInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
				throws Exception {
		System.out.println("TimeCheckingJHandlerInterceptor.preHandle()");
		
		if(req.getServletPath().equalsIgnoreCase("/"))  // Do not apply this logic for  home page.
			 return true;
		
		 //get System date and time
		 LocalDateTime  ldt=LocalDateTime.now();
		 //  get courrent hour of the day
		 int hour =ldt.getHour();
		 // check the timings
		  if(hour<9 || hour>17) {
			   RequestDispatcher rd=req.getRequestDispatcher("/timeout.jsp");  //place timeout.jsp in src/main/webapp folder
			   rd.forward(req, res);
			   return false;
		  }
		  return true;
	}

}

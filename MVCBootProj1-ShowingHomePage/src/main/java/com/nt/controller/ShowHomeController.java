//ShowHomeController.java
package com.nt.controller;






import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {
	
	/*@RequestMapping("/home")
	public   String  launchHomePage() {
		//return  LVN
		return "welcome";
		
	}*/
	
	
	@RequestMapping("/")
	public   String  launchHomePage() {
		//return  LVN
		return "welcome";
		
	}
	
	/*@RequestMapping("/process")
	public  String   process(Map<String,Object> map) {
		System.out.println("ShowHomeController.process():: ShareMemory Object class name::"+map.getClass());
		//add  model attributes to  shared Memory
		map.put("attr1","val1");
		map.put("sysDt",LocalDateTime.now());
		
		//return LVN
		return "show_data";
		
	}
	*/
	
	/*@RequestMapping("/process")
	public  String   process(Model model) {
		System.out.println("ShowHomeController.process():: ShareMemory Object class name::"+model.getClass());
		//add  model attributes to  shared Memory
		model.addAttribute("attr1","val1");
		model.addAttribute("sysDt", LocalDateTime.now());
		
		
		//return LVN
		return "show_data";
		
	}*/
	
	/*@RequestMapping("/process")
	public  String   process(Model model) {
		System.out.println("ShowHomeController.process():: ShareMemory Object class name::"+model.getClass());
		//add  model attributes to  shared Memory
		model.addAttribute("attr1","val1");
		model.addAttribute("sysDt", LocalDateTime.now());
		
		
		//return LVN
		return "show_data";
		
	}
	*/
	
	/*@RequestMapping("/process")
	public  String   process(ModelMap map) {
		System.out.println("ShowHomeController.process():: ShareMemory Object class name::"+map.getClass());
		//add  model attributes to  shared Memory
		map.addAttribute("attr1","val1");
		map.addAttribute("sysDt", LocalDateTime.now());
		
		
		//return LVN
		return "show_data";
		
	}*/
	
	
	/*@RequestMapping("/process")
	public  Map<String,Object> process() {
	    //create SharedMemory
		Map<String,Object> map=new HashMap();
		//add  model attributes to  shared Memory
	    map.put("attr1","val1");
	    map.put("sysDt", LocalDateTime.now());
	   return map;
		
	}
	*/
	
	/*@RequestMapping("/process")
	public  ModelAndView  process() {
	    //create SharedMemory
		 ModelAndView mav=new  ModelAndView();
		//add  model attributes to  shared Memory
	     mav.addObject("attr1", "val1");
	     mav.addObject("sysDt",LocalDateTime.now());
	     // place LVN to MAV object
	     mav.setViewName("show_data");
	   return mav;
		
	}*/
	
	/*	@RequestMapping("/process")
		public  void  process(Map<String,Object> map) {
		 	//add  model attributes to  shared Memory
		    map.put("attr1","val1");
		    map.put("sysDt",new Date());
		}*/
	
	
	/*@RequestMapping("/process")
	public  String  process(HttpServletRequest req) {
	 	System.out.println("ShowHomeController.process()::"+req.hashCode());
	 	req.setAttribute("attr1", "val1");
	    return  "redirect:report";
	}
	
	@RequestMapping("/report")
	public  String  showReport(HttpServletRequest req) {
		System.out.println("req attribute ::"+req.getAttribute("attr1"));
		System.out.println("ShowHomeController.showReport()");
	   return "show_data";
	}*/
	
	/*@RequestMapping("/process")
	public  String  process(HttpSession  ses) {
	 	ses.setAttribute("attr1", "val1");
	    return  "show_data";
	}*/
	
	
	/*@Autowired
	private ServletContext sc;
	@Autowired
	private  ServletConfig cg;
	
	@RequestMapping("/process")
	public  String  process(Map<String,Object> map) {
		System.out.println("web application context path::"+sc.getContextPath());
		System.out.println( "DS Logical name::"+cg.getServletName());
	 	map.put("attr1", "val1");  //Model attribute
	    return  "show_data";
	}*/
	
	
	@RequestMapping("/process")
	public  void  process(HttpServletResponse res) throws Exception{
	 	//get PrintWriter 
		PrintWriter pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//write data to browser s/w
		pw.println("<b> directly from  handler method </b>");
		
		//return;
	   
	}
	
	
}

package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("emp")
//@PropertySource("classpath:com/nt/commons/Info.properties")
public class Employee {
	//@Value("101") -directly
	@Value("${emp.id}")
	private int empno;
	@Value("${emp.name}")
	private String empname;
	@Value("${emp.addrs}")
	private  String empaddrs;
	
	@Value("${os.name}")
	private  String os;
	@Value("${os.version}")
	private  String osver;
	@Value("${user.name}")
	private   String user;
	
	@Value("${Path}")
	private  String  pathContent;

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", empaddrs=" + empaddrs + ", os=" + os
				+ ", osver=" + osver + ", user=" + user + ", pathContent=" + pathContent + "]";
	}
	
	
	
	

}

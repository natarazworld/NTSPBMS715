//AppConfig.java
package com.nt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt")
@ImportResource(locations = "com/nt/cfgs/applicationContext.xml")
@PropertySource(value = "com/nt/commons/jdbc.properties")
public class AppConfig {
	@Autowired
	private Environment  env;
	
	@Bean(name="dmds")
	public  DriverManagerDataSource  createDMDS() {
		DriverManagerDataSource  dmds=new DriverManagerDataSource();
		dmds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		dmds.setUrl(env.getRequiredProperty("jdbc.url"));
		dmds.setUsername(env.getRequiredProperty("jdbc.username"));
		dmds.setPassword(env.getRequiredProperty("jdbc.password"));
		return dmds;
	}
	

}

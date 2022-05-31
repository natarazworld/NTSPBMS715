//PersistenceConfig.java
package com.nt.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
@PropertySource(value = "com/nt/commons/jdbc.properties")
public class PersistenceConfig {
	@Autowired
	private Environment  env;
	
	/*@Bean(name="dmds")
	public  DriverManagerDataSource  createDMDS() {
		DriverManagerDataSource  dmds=new DriverManagerDataSource();
		dmds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		dmds.setUrl(env.getRequiredProperty("jdbc.url"));
		dmds.setUsername(env.getRequiredProperty("jdbc.username"));
		dmds.setPassword(env.getRequiredProperty("jdbc.password"));
		return dmds;
	}*/
	
	/*@Bean(name="dbcp2DS")
	public  DataSource   createApacheDBCP2DS() {
		   BasicDataSource   bds=new BasicDataSource();
		   bds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		   bds.setUrl(env.getRequiredProperty("jdbc.url"));
		   bds.setUsername(env.getRequiredProperty("jdbc.username"));
		   bds.setPassword(env.getRequiredProperty("jdbc.password"));
		   bds.setMinIdle(10);  // initial con objs in the jdbc con pool
		   bds.setMaxTotal(100);  // max con objs in the jdbc con pool
		   bds.setMaxWaitMillis(30000);  // max wait time in millis  to get avail the jdbc con object
		   return bds;
	}*/
	
	@Bean(name="hkcpDS")
	public  DataSource   createHKCPDS() {
		 HikariDataSource  hkDs=new HikariDataSource();
		 hkDs.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		 hkDs.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
		 hkDs.setUsername(env.getRequiredProperty("jdbc.username"));
		 hkDs.setPassword(env.getRequiredProperty("jdbc.password"));
		 hkDs.setMinimumIdle(10);
		 hkDs.setMaximumPoolSize(100);
		 hkDs.setConnectionTimeout(30000);
		 return hkDs;
	}

}

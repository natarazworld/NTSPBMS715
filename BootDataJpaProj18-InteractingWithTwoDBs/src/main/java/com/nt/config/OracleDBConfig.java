package com.nt.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
@EnableJpaRepositories(basePackages="com.nt.repo.product",
                                                   entityManagerFactoryRef = "oraEMF",
                                                   transactionManagerRef = "oraTxMgmr")
                                                   
public class OracleDBConfig {
	
	@Bean
	@ConfigurationProperties(prefix="oracle.datasource")
	@Primary
	public   DataSource  createOraDs() {
		return  DataSourceBuilder.create().build();
		
	}
	
	@Bean(name="oraEMF")
	@Primary
	public   LocalContainerEntityManagerFactoryBean  createOraEntityFactory(EntityManagerFactoryBuilder builder) {
		  //create Properties object having hibernate properties
		    Map<String,String> props=new HashMap();
		    props.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		    props.put("hibernate.hbm2ddl.auto", "update");
		   //create and return LocalContainerEntityManagerFactoryBean 
		      return  builder.dataSource(createOraDs()).packages("com.nt.model.product").properties(props).build();
	}
	
	@Bean(name="oraTxMgmr")
	@Primary
	public   JpaTransactionManager  createOraTxMgmr(EntityManagerFactory  emFactory) {
		return  new JpaTransactionManager(emFactory);
	}

}

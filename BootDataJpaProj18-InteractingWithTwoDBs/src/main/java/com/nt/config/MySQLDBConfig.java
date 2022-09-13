//MySQLDBConfig.java
package com.nt.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
 @EnableJpaRepositories(basePackages = "com.nt.repo.offers",
                                                     entityManagerFactoryRef = "mySQLEMF",
                                                     transactionManagerRef = "mySQLTxMgmr")
public class MySQLDBConfig {
	
	@Bean
	@ConfigurationProperties(prefix = "mysql.datasource")
	public    DataSource createMySQLDS() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name="mySQLEMF")
	public  LocalContainerEntityManagerFactoryBean  createEMFactory(EntityManagerFactoryBuilder builder) {
		//create Properties object having hibernate properties
	    Map<String,String> props=new HashMap();
	    props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
	    props.put("hibernate.hbm2ddl.auto", "update");
		  return  builder.dataSource(createMySQLDS()).properties(props).packages("com.nt.model.offers").build();
	}
	
	@Bean(name="mySQLTxMgmr")
	public JpaTransactionManager  createTxMgmr(@Qualifier("mySQLEMF")EntityManagerFactory  factory) {
		return  new JpaTransactionManager(factory);
	}

}

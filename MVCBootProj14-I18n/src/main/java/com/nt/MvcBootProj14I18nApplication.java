package com.nt;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class MvcBootProj14I18nApplication {
	
	@Bean("localeResolver")  //fixed bean id   (useful to activate I18n in spring boot MVC app)
	public  SessionLocaleResolver  createSessionLocaleResolver() {
		  SessionLocaleResolver resolver=new SessionLocaleResolver();
		  resolver.setDefaultLocale(new Locale("en","US"));
		  return resolver;
		
	}
	
	@Bean("lci")  //not the fixed bean id
	public  LocaleChangeInterceptor  createLCInterceptor() {
		 LocaleChangeInterceptor lci=new LocaleChangeInterceptor();
		 lci.setParamName("lang");  //default is Locale
		 return lci;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(MvcBootProj14I18nApplication.class, args);
	}

}

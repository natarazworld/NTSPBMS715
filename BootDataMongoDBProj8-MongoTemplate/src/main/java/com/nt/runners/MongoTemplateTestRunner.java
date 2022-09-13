package com.nt.runners;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.StockDetails;
import com.nt.service.IStockMarketMgmtService;

@Component
public class MongoTemplateTestRunner implements CommandLineRunner {
	@Autowired
	private  IStockMarketMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		/*	// save object
			StockDetails details=new StockDetails(new Random().nextInt(1000),"ICICI",900.66,"BSE");
			System.out.println(service.registerStock(details));*/
		
		/*	// bulk /batch insertion
			  StockDetails  details1=new StockDetails(new Random().nextInt(2000),"SBI",989.00,"BSE");
			  StockDetails  details2=new StockDetails(new Random().nextInt(3000),"Reliance",984.00,"BSE");
			  System.out.println(service.registerAllStocks(List.of(details1, details2)));*/
		
		 //  select operation 
		  //service.searchStocksByExchangeName("BSE").forEach(System.out::println);
             //   service.searchStocksByPriceRange(100.0, 1000.0).forEach(System.out::println);
		   //System.out.println(service.searchStockByStockId(335));
		
		 //System.out.println(service.updateStockDetailsById(335, 1020.0));
		
		//System.out.println(service.updateStocksByPriceRange(1000.0, 2000.0, "NSE"));
		
		//System.out.println(service.registerOrUpdateStockByStockName("ambani Group",1131.0, "NSE"));
		
		System.out.println(service.removeStockByStockName("ICICI"));
		   
	}

}

package com.nt.runners;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.offers.Offers;
import com.nt.model.product.Product;
import com.nt.repo.offers.IOffersRepo;
import com.nt.repo.product.IProductRepository;

@Component
public class MultiDataSourceTestRunner implements CommandLineRunner {
	@Autowired
	private  IProductRepository  prodRepo;
	@Autowired
	private  IOffersRepo   offersRepo;

	@Override
	public void run(String... args) throws Exception {
		/*//prepare  model class objs
		Product prod=new Product("table",900000.0,10.0);
		Offers offers1=new Offers("monsoon offer", 10.0, LocalDate.of(2022,11,20));
		Offers offers2=new Offers("winter offer", 17.0, LocalDate.of(2022,10,20));
		//save Product info  in oracle db table
		 System.out.println("Product is saved to Oracle with id value::"+prodRepo.save(prod).getPid());
		 //save offers in mysql  db table
		 int  count=offersRepo.saveAll(List.of(offers1,offers2)).size();
		 System.out.println(count+" no.of offerrs are saved");*/
		
		System.out.println("The Products Info");
		prodRepo.findAll().forEach(System.out::println);
		System.out.println("Offers are");
		offersRepo.findAll().forEach(System.out::println);

	}

}

package com.nt.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.client.result.UpdateResult;
import com.nt.document.StockDetails;

@Service
public class StockMarketMgmtServiceImpl implements IStockMarketMgmtService {
	@Autowired
	private   MongoTemplate  template;

	@Override
	public String registerStock(StockDetails details) {
	  // return  "Stock object is saved having id value:"+  template.save(details).getStockId();   // saves doc  by taking collection name from @Documnet  class
		return  "Stock object is saved having id value:"+  template.save(details,"STOCK_DETAILS").getStockId();  //saves doc  by taking given collection name
		//return  " Stock object is saved having id value:"+  template.insert(details).getStockId();  //saves doc  by taking collection name from @Documnet  class
	
	}

	@Override
	public String registerAllStocks(List<StockDetails> list) {
	   int count=template.insert(list, "STOCK_DETAILS").size();
	   return count +" no.of docs are saved";
		
	}
	
	@Override
	public List<StockDetails> searchStocksByExchangeName(String exchange) {
	    //prepare Query object representing the where clause condition
		Query query= new Query();
		query.addCriteria(Criteria.where("exchageName").is(exchange));
		//execute  Query
		List<StockDetails>  list=template.find(query,StockDetails.class,"STOCK_DETAILS");
		
		return list;
	}
	
	@Override
	public List<StockDetails> searchStocksByPriceRange(double start, double end) {
		  //prepare Query object representing the where clause condition
				Query query= new Query();
				query.addCriteria(Criteria.where("price").gte(start).lte(end));
				//execute  Query
				List<StockDetails>  list=template.find(query,StockDetails.class,"STOCK_DETAILS");
				
				return list;
	}
	
	@Override
	public StockDetails searchStockByStockId(int stockId) {
		
		return template.findById(stockId,StockDetails.class, "STOCK_DETAILS");
	}

	@Override
	public String updateStockDetailsById(int stockId, double newPrice) {
		//prepare Query object  representing the where clause condition
		 Query query=new Query();
		 query.addCriteria(Criteria.where("stockId").is(stockId));
		 //prepare Update object representing  data to modify
		 Update update=new Update();
		 update.set("price", newPrice);
		 //execute the logics
		 StockDetails details=template.findAndModify(query, update, StockDetails.class,"STOCK_DETAILS");
		return details==null?"Stock not found":"stock found and updated";
	}
	
	@Override
	public String updateStocksByPriceRange(double startPrice, double endPrice, String newExchangeName) {
		//prepare Query object  representing the where clause condition
		 Query query=new Query();
		 query.addCriteria(Criteria.where("price").gte(startPrice).lte(endPrice));
		 //create Update object
		 Update update=new Update();
		 update.set("exchageName",newExchangeName);
		 //execute the logic
		 UpdateResult  result=template.updateMulti(query, update, StockDetails.class,"STOCK_DETAILS");
		return result.getModifiedCount()+" no.of doc are updated";
	}
	
	@Override
	public String registerOrUpdateStockByStockName(String stockName, double price, String exchangeName) {
		//prepare Query object  representing the where clause condition
		 Query query=new Query();
		 query.addCriteria(Criteria.where("stockName").is(stockName));
		 //Update object having data to insert/update
		    //will be used in both update and insert opeartions
		 Update update=new Update();
		 update.set("price",price);
		 update.set("exchageName",exchangeName);
		  // will be used only in  insert opeation
		 update.setOnInsert("stockId", new Random().nextInt(1000));
		 update.setOnInsert("stockName", stockName);
		 //execute the logic
		 UpdateResult result=template.upsert(query, update, StockDetails.class,"STOCK_DETAILS");
		 
		   if(result.getModifiedCount()==0)
			   return " new Documnet is  inserted with id value :"+result.getUpsertedId();
		  else
			   return  " Existing doc is updated";
				   
		
	}
	
	@Override
	public String removeStockByStockName(String stockName) {
		//prepare Query object  representing the where clause condition
		 Query query=new Query();
		 query.addCriteria(Criteria.where("stockName").is(stockName));
		//execute the logic
		 StockDetails details=template.findAndRemove(query, StockDetails.class,"STOCK_DETAILS");
		 return  details!=null?" Doc is removed":" Doc not found";
		 
		 
		
	}

}

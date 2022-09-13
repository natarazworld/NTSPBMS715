package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "STOCK_INFO")
public class StockDetails {
	@Id
	private Integer stockId;
	private  String stockName;
	  private  Double  price;
	  private  String exchageName;
	  
	  
	 public StockDetails() {
		
	} 
	  
	  public StockDetails(Integer stockId, String stockName, Double price, String exchageName) {
		
		this.stockId = stockId;
		this.stockName = stockName;
		this.price = price;
		this.exchageName = exchageName;
	}
	  
	//setters && getters
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getExchageName() {
		return exchageName;
	}
	public void setExchageName(String exchageName) {
		this.exchageName = exchageName;
	}
	
	//toString(-)
	@Override
	public String toString() {
		return "StockDetails [stockId=" + stockId + ", stockName=" + stockName + ", price=" + price + ", exchageName="
				+ exchageName + "]";
	}
	
	

}

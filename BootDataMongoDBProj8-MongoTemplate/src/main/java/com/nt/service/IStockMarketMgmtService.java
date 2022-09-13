package com.nt.service;

import java.util.List;

import com.nt.document.StockDetails;

public interface IStockMarketMgmtService {
    public  String  registerStock(StockDetails details);
    public   String   registerAllStocks(List<StockDetails> list);
    public   List<StockDetails>   searchStocksByExchangeName(String exchangeName);
    public  List<StockDetails>  searchStocksByPriceRange(double start,double end);
    public   StockDetails   searchStockByStockId(int stockId);
    public   String    updateStockDetailsById(int stockId, double newPrice);
    public   String   updateStocksByPriceRange(double startPrice,double endPrice, String newExchangeName);
    public   String   registerOrUpdateStockByStockName(String stockName,double price, String exchangeName);
    public   String    removeStockByStockName(String stockName);
 }

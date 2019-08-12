package com.cts.stockmarketcharting.service;

import java.util.List;

import com.cts.stockmarketcharting.entity.StockExchange;

public interface StockExchangeService {

	List<StockExchange>getStockExchangeList();
	void addStockExchange(StockExchange stockExchange);
	
}
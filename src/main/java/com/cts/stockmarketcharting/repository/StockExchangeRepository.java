package com.cts.stockmarketcharting.repository;

import java.util.List;

import com.cts.stockmarketcharting.entity.StockExchange;

public interface StockExchangeRepository {

	List<StockExchange> getStockExchangeList();
	void addStockExchange(StockExchange stockExchange);
	
}

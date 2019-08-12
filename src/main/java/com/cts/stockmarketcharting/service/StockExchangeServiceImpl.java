package com.cts.stockmarketcharting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.stockmarketcharting.entity.StockExchange;
import com.cts.stockmarketcharting.repository.StockExchangeRepository;

@Service("stockExchangeService")
public class StockExchangeServiceImpl implements StockExchangeService {

	@Autowired
	StockExchangeRepository stockExchangeRepository;
	
	@Override
	public List<StockExchange> getStockExchangeList() {
		// TODO Auto-generated method stub
		return stockExchangeRepository.getStockExchangeList();
	}

	@Override
	public void addStockExchange(StockExchange stockExchange) {
		stockExchangeRepository.addStockExchange(stockExchange);

	}

}

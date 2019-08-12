package com.cts.stockmarketcharting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.stockmarketcharting.entity.StockExchange;
import com.cts.stockmarketcharting.service.StockExchangeService;

@RestController
@RequestMapping("stockexchange")
public class StockExchangeController {

	
	@Autowired
	StockExchangeService stockExchangeService;
	
	@GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StockExchange>> getStockExchangeList()
	{	
		return new ResponseEntity<List<StockExchange>>(stockExchangeService.getStockExchangeList(),HttpStatus.OK);	
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addStockExchange(@RequestBody StockExchange stockExchange)
	{
		stockExchangeService.addStockExchange(stockExchange);
	}
	
	
	@GetMapping("test")
	public String test()
	{
		return "working";
	}
	
	
	
}

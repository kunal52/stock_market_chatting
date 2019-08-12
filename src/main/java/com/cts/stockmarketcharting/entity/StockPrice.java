package com.cts.stockmarketcharting.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Stock_Price")
public class StockPrice {
	
	@Id @NotNull
	@Column(name="company_code")
	private String companyCode;
	
	@OneToOne(cascade = CascadeType.ALL,targetEntity = StockExchange.class)
	private StockExchange stockExchange;
	
	@NotNull
	@Column(name="current_price")
	private double currentPrice;
	
	@NotNull
	@Column(name="stock_price_date")
	private String stockPriceDate;
	
	@NotNull
	@Column(name="Stock_price_time")
	private String stockPriceTime;

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public StockExchange getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(StockExchange stockExchange) {
		this.stockExchange = stockExchange;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getStockPriceDate() {
		return stockPriceDate;
	}

	public void setStockPriceDate(String stockPriceDate) {
		this.stockPriceDate = stockPriceDate;
	}

	public String getStockPriceTime() {
		return stockPriceTime;
	}

	public void setStockPriceTime(String stockPriceTime) {
		this.stockPriceTime = stockPriceTime;
	}
	
}

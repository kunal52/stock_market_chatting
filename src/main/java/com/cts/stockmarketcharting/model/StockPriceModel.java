package com.cts.stockmarketcharting.model;

public class StockPriceModel {
	
	private String companyCode;
	
	
	private int stockExchangeId;
	private String stockEXchangeName;
	private String stockExchangeBrief;
	private String stockExchangeContactAddress;
	private String stockExchangeRemark;

	private double currentPrice;
	private String stockPriceDate;
	private String stockPriceTime;
	
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public int getStockExchangeId() {
		return stockExchangeId;
	}
	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}
	public String getStockEXchangeName() {
		return stockEXchangeName;
	}
	public void setStockEXchangeName(String stockEXchangeName) {
		this.stockEXchangeName = stockEXchangeName;
	}
	public String getStockExchangeBrief() {
		return stockExchangeBrief;
	}
	public void setStockExchangeBrief(String stockExchangeBrief) {
		this.stockExchangeBrief = stockExchangeBrief;
	}
	public String getStockExchangeContactAddress() {
		return stockExchangeContactAddress;
	}
	public void setStockExchangeContactAddress(String stockExchangeContactAddress) {
		this.stockExchangeContactAddress = stockExchangeContactAddress;
	}
	public String getStockExchangeRemark() {
		return stockExchangeRemark;
	}
	public void setStockExchangeRemark(String stockExchangeRemark) {
		this.stockExchangeRemark = stockExchangeRemark;
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

package com.cts.stockmarketcharting.model;

public class IPODetailModel {
	
	private int ipoId;
	private String companyName;

	
	private int stockExchangeId;
	private String stockEXchangeName;
	private String stockExchangeBrief;
	private String stockExchangeContactAddress;
	private String stockExchangeRemark;

	private double pricePerShare;
	private int totalNumberOfShares;
	private String openDateTime;
	private String ipoRemarks;
	
	public int getIpoId() {
		return ipoId;
	}
	public void setIpoId(int ipoId) {
		this.ipoId = ipoId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public double getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public int getTotalNumberOfShares() {
		return totalNumberOfShares;
	}
	public void setTotalNumberOfShares(int totalNumberOfShares) {
		this.totalNumberOfShares = totalNumberOfShares;
	}
	public String getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}
	public String getIpoRemarks() {
		return ipoRemarks;
	}
	public void setIpoRemarks(String ipoRemarks) {
		this.ipoRemarks = ipoRemarks;
	}

}

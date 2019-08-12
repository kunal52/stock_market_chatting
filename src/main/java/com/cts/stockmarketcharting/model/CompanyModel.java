package com.cts.stockmarketcharting.model;

import com.cts.stockmarketcharting.entity.Sector;

public class CompanyModel {

	private String companyCode;	
	private String companyName;
	private double companyTurnover;
	private String companyCeo;	
	private String[] companyBoardOfDirectors;
	private int companyListedInStockExchanges;
	private String companyBriefWriteup;

	
	Sector sector;
	
	private int sectorId;
	private String sectorName;
	private String sectorBrief;
		
	/*
	 * @OneToOne(cascade = CascadeType.ALL,targetEntity = StockExchange.class)
	 * private StockExchange stockExchange;
	 */
	
	private int stockExchangeId;	
	private String stockEXchangeName;
	private String stockExchangeBrief;
	private String stockExchangeContactAddress;
	private String stockExchangeRemark;

	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getCompanyTurnover() {
		return companyTurnover;
	}
	public void setCompanyTurnover(double companyTurnover) {
		this.companyTurnover = companyTurnover;
	}
	public String getCompanyCeo() {
		return companyCeo;
	}
	public void setCompanyCeo(String companyCeo) {
		this.companyCeo = companyCeo;
	}
	public String[] getCompanyBoardOfDirectors() {
		return companyBoardOfDirectors;
	}
	public void setCompanyBoardOfDirectors(String[] companyBoardOfDirectors) {
		this.companyBoardOfDirectors = companyBoardOfDirectors;
	}
	public int getCompanyListedInStockExchanges() {
		return companyListedInStockExchanges;
	}
	public void setCompanyListedInStockExchanges(int companyListedInStockExchanges) {
		this.companyListedInStockExchanges = companyListedInStockExchanges;
	}
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public String getSectorBrief() {
		return sectorBrief;
	}
	public void setSectorBrief(String sectorBrief) {
		this.sectorBrief = sectorBrief;
	}
	public String getCompanyBriefWriteup() {
		return companyBriefWriteup;
	}
	public void setCompanyBriefWriteup(String companyBriefWriteup) {
		this.companyBriefWriteup = companyBriefWriteup;
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
	
}

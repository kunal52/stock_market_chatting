package com.cts.stockmarketcharting.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="company")
public class Company {

	@Id @NotNull
	@Column(name="company_code")
	private String companyCode;
	
	@NotNull
	@Column(name="company_name")
	private String companyName;

	@NotNull
	@Column(name="company_turnover")
	private double companyTurnover;
	
	@NotNull
	@Column(name="company_ceo")
	private String companyCeo;
	
	
	@NotNull
	@ElementCollection
	@CollectionTable(name="Company_Board_Of_Directors", joinColumns=@JoinColumn(name="company_code"))
	@Column(name="company_board_of_directors")
	private List<String> companyBoardOfDirectors;
	
	@NotNull
	@ElementCollection
	@CollectionTable(name="Company_Listed_In_Stock_Exchanges", joinColumns=@JoinColumn(name="company_code"))
	@Column(name="company_listed_in_stock_exchanges")
	private List<String> companyListedInStockExchanges;
	
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Sector.class)
	private Sector sector;
	
	@NotNull
	@Column(name="company_brief_writeup")
	private String companyBriefWriteup;
	
	private String  stockCode;
	
	private boolean activated;

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

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public List<String> getCompanyBoardOfDirectors() {
		return companyBoardOfDirectors;
	}

	public void setCompanyBoardOfDirectors(List<String> companyBoardOfDirectors) {
		this.companyBoardOfDirectors = companyBoardOfDirectors;
	}

	public String getCompanyBriefWriteup() {
		return companyBriefWriteup;
	}

	public void setCompanyBriefWriteup(String companyBriefWriteup) {
		this.companyBriefWriteup = companyBriefWriteup;
	}

	public List<String> getCompanyListedInStockExchanges() {
		return companyListedInStockExchanges;
	}

	public void setCompanyListedInStockExchanges(List<String> companyListedInStockExchanges) {
		this.companyListedInStockExchanges = companyListedInStockExchanges;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	
	
	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	@Override
	public String toString() {
		return "Company [companyCode=" + companyCode + ", companyName=" + companyName + ", companyTurnover="
				+ companyTurnover + ", companyCeo=" + companyCeo + ", companyBoardOfDirectors="
				+ companyBoardOfDirectors + ", companyListedInStockExchanges=" + companyListedInStockExchanges
				+ ", sector=" + sector + ", companyBriefWriteup=" + companyBriefWriteup + ", stockCode=" + stockCode
				+ "]";
	}
	
	
}

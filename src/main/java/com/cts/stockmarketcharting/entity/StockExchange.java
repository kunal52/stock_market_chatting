package com.cts.stockmarketcharting.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Stock_Exchange")
public class StockExchange {

	@Id @NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@NotNull
	@Column(name="stock_exchange_name")
	private String stockEXchangeName;
	
	@NotNull
	@Column(name="stock_exchange_brief")
	private String stockExchangeBrief;
	
	@NotNull
	@Column(name="stock_exchange_contact_address")
	private String stockExchangeContactAddress;
	
	@NotNull
	@Column(name="stock_exchange_remark")
	private String stockExchangeRemark;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

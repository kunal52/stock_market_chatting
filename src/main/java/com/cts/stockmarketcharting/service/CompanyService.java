package com.cts.stockmarketcharting.service;

import com.cts.stockmarketcharting.entity.Company;

public interface CompanyService {
	
	void addCompany(Company company);
	void updateCompany(Company company);
	void activateCompany(Company company);
	void deactivateComany(Company company);

}

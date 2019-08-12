package com.cts.stockmarketcharting.repository;

import com.cts.stockmarketcharting.entity.Company;

public interface CompanyRepository {

	public void addCompany(Company company);

	
	public void updateCompany(Company company);
	
	public void deactivateCompany(Company company);
	
	public void activateCompany(Company company);
	
}

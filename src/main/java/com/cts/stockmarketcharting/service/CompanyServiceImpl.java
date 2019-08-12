package com.cts.stockmarketcharting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.stockmarketcharting.entity.Company;
import com.cts.stockmarketcharting.repository.CompanyRepository;


@Service("companyService")
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	CompanyRepository companyRepository;
	
	@Override
	public void addCompany(Company company) {
		companyRepository.addCompany(company);
	}

	@Override
	public void updateCompany(Company company) {
		companyRepository.updateCompany(company);
		
	}

	@Override
	public void activateCompany(Company company) {
		companyRepository.activateCompany(company);
		
	}

	@Override
	public void deactivateComany(Company company) {
		companyRepository.deactivateCompany(company);
		
	}
	
	

}

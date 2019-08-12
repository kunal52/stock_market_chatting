package com.cts.stockmarketcharting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.stockmarketcharting.entity.Company;
import com.cts.stockmarketcharting.service.CompanyService;

@RestController
@RequestMapping("company")
public class CompanyController {

	@Autowired
	CompanyService companyService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> addCompany(@RequestBody Company company)
	{
		company.setActivated(true);
		companyService.addCompany(company);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PutMapping(value = "{id}",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateCompany(@PathVariable("id")String id,Company company)
	{
		company.setCompanyCode(id);
		companyService.updateCompany(company);
	}
	
	
	@PostMapping(value = "activate",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public void activateCompany(Company company)
	{
		company.setActivated(true);
		companyService.activateCompany(company);
	}
	
	@PostMapping(value = "deactivate",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public void dactivateCompany(Company company)
	{
		company.setActivated(false);
		companyService.deactivateComany(company);
	}

}

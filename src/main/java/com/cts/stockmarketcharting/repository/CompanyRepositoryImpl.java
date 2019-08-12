package com.cts.stockmarketcharting.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.stockmarketcharting.entity.Company;

@Repository("companyRepository")
public class CompanyRepositoryImpl implements CompanyRepository {

	
	@Autowired
	EntityManager entityManager;
	
	@Override
	@Transactional
	public void addCompany(Company company) {
		Session session = entityManager.unwrap(Session.class);
		session.save(company);

	}

	@Override
	@Transactional
	public void updateCompany(Company company) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(company);
	}

	@Override
	@Transactional
	public void deactivateCompany(Company company) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(company);

	}

	@Override
	@Transactional
	public void activateCompany(Company company) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(company);

	}

}

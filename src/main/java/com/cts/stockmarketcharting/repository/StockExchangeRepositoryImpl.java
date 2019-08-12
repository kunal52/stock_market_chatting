package com.cts.stockmarketcharting.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.stockmarketcharting.entity.StockExchange;

@Repository("stockExchangeRepository")
public class StockExchangeRepositoryImpl implements StockExchangeRepository {

	@Autowired
	EntityManager entityManager;
	
	@Override
	@Transactional
	public List<StockExchange> getStockExchangeList() {
		
		Session session = entityManager.unwrap(Session.class);
		Query<StockExchange> createQuery = session.createQuery("from StockExchange",StockExchange.class);
		List<StockExchange> resultList = createQuery.getResultList();
		session.close();
		return resultList;
	}

	@Override
	@Transactional
	public void addStockExchange(StockExchange stockExchange) {
		Session session = entityManager.unwrap(Session.class);
		session.save(stockExchange);
		session.close();
	}

}

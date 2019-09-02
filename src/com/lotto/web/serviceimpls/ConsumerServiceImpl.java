package com.lotto.web.serviceimpls;

import com.lotto.web.daoimps.ConsumerDAOImpl;
import com.lotto.web.daos.ConsumerDAO;
import com.lotto.web.domains.ConsumerBean;
import com.lotto.web.services.ConsumerService;

public class ConsumerServiceImpl implements ConsumerService{
	private ConsumerDAO dao;
	public ConsumerServiceImpl() {
		dao = new ConsumerDAOImpl();
	}

	@Override
	public void registerConsumer(ConsumerBean param) {
		ConsumerDAO dao = new ConsumerDAOImpl();
		dao.insertConsumer(param);
	}

}

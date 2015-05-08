package com.clarkstuth.SpringSpike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenericServiceImpl implements GenericService {

	private GenericDao dao;

	@Autowired
	public GenericServiceImpl(GenericDao dao) {
		this.dao = dao;
		// TODO Auto-generated constructor stub
	}

	public void doSomething() {
		System.out.println("I did something!");

		dao.saveData("something");
	}

}

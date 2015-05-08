package com.clarkstuth.SpringSpike;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class GenericDaoImpl implements GenericDao {

	@Value("${app.myProperty:bar}")
	private String myProperty;

	public void saveData(String something) {
		System.out.println(String.format("I saved: %s with property %s", something, myProperty));
	}

}

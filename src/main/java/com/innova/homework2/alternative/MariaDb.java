package com.innova.homework2.alternative;

import javax.enterprise.inject.Alternative;

@Alternative

public class MariaDb implements MyDatabase {
	
	@Override
	public String myDatabase(String data) {
		return "MariaDb ";
	}
	
}

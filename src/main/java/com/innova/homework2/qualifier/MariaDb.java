package com.innova.homework2.qualifier;

import javax.enterprise.inject.Default;

@Default

public class MariaDb implements MyConnectedDatabase {
	
	@Override
	public String connectedDatabase(String data) {
		
		return "Default MariaDb connection";
		
	}
	
}

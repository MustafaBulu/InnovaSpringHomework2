package com.innova.homework2.qualifier;

@QualifierSelection

public class Mysql implements MyConnectedDatabase {
	
	@Override
	public String connectedDatabase(String data) {
		return "Mysql connection";
	}
	
}

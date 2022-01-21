package com.innova.homework2.qualifier;

public class Mssql implements MyConnectedDatabase {
	
	@Override
	public String connectedDatabase(String data) {
		
		return "Mssql connection";
	}
	
}

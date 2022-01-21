package com.innova.homework2.enumqualifier;

@EQualifier(EDatabaseVersion.MSSQL)
public class Mssql implements MyDatabaseVersion {
	
	@Override
	public String databaseVersion(String data) {
		return "Optional MSSQL";
	}
}

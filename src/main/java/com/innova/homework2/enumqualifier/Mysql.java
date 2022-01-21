package com.innova.homework2.enumqualifier;

@EQualifier(EDatabaseVersion.MYSQL)
public class Mysql implements MyDatabaseVersion {
	
	@Override
	public String databaseVersion(String data) {
		return "Optional MYSQL";
	}
}

package com.innova.homework2.enumqualifier;

import javax.enterprise.inject.Default;

@Default
public class DefaultDatabase implements MyDatabaseVersion {
	
	@Override
	public String databaseVersion(String data) {
		return "database MariaDb";
	}
	
}

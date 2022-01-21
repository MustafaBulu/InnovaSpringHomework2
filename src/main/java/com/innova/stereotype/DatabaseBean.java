package com.innova.stereotype;

@InnovaMultipleDatabaseAnnotation
// streotype yapısı çok annotation ı teke indirir.
public class DatabaseBean {
	
	private String databaseName = "Database";
	
	public String getDatabaseName() {
		return databaseName;
	}
	
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	
}

package com.innova.homework2.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeCDI")
@ApplicationScoped

public class DatabaseManager {
	
	@Inject
	private MyDatabase mydatabase;
	
	public String getmyDatabase() {
		
		return mydatabase.myDatabase("Kullanılan Database:  ");
	}
	
}

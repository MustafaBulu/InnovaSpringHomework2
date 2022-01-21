package com.innova.homework2.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("qualifierCDI")
@ApplicationScoped

public class QualifierManager implements Serializable {
	private static final long serialVersionUID = 1L;
	@Inject
	@QualifierSelection
	
	private MyConnectedDatabase myConnectedDatabase;
	
	public String getmyDatabaseVersion() {
		
		return myConnectedDatabase.connectedDatabase("Kullanılan Database");
		
	}
	
}

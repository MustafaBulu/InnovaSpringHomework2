package com.innova.homework2.interceptor;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("interceptorAOP")
@ApplicationScoped
public class Bean implements Serializable {
	private static final long serialVersionUID = 21825732;
	
	@Inject
	private DatabaseLogin login;
	
	public String getConnect() {
		return login.isLogin("Connected");
		
	}
	
}

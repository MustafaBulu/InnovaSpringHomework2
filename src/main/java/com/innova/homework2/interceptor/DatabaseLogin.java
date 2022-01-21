package com.innova.homework2.interceptor;

@DatabaseInterceptorInterface
public class DatabaseLogin {
	
	public String isLogin(String data) {
		
		return "Database: " + data;
		
	}
	
}

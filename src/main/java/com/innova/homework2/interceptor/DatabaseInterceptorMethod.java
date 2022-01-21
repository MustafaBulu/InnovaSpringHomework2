package com.innova.homework2.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@DatabaseInterceptorInterface
@Interceptor
public class DatabaseInterceptorMethod {
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {
		// context dediğimiz aslında DatabaseLogin sınıfındaki isLogin den gelen bilgilerdir.
		System.out.println("önceki durumum" + context.getMethod().getName() + "" + context.getClass());
		
		// database sorgulama yaptık
		boolean isLogin = true;
		Object isContinue = null;
		
		if (isLogin) {
			System.out.println("connection failed ");
			return null;
			
		} else {
			
			try {
				isContinue = context.proceed();
				System.out.println("connected to database");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return isContinue;
	}
	
}

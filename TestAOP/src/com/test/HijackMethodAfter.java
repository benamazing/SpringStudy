package com.test;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class HijackMethodAfter implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("After running " + method.getName());
	}

}

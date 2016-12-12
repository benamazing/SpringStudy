package com.test;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HijackMethodBefore implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before running " + method.getName());
		
	}

}

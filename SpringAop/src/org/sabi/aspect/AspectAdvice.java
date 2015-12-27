package org.sabi.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectAdvice {
	@Before("allGets()")
	public void shapeAdvice(){
		System.out.println("Advice printed - getMethod called ");
	}
	
	   @After("allGets()")
		public void secondShapeAdvice(){
			System.out.println("aa chako ik hor advice ");
		}
		
		
		@Pointcut("execution(public String get*())")
		public void allGets(){}
	}


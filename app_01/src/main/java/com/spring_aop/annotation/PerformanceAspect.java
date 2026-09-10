package com.spring_aop.annotation;
// 공통 기능, 공통 기능 메소드 포함
// 시작 시간 종료 시간 출력의 기능을 핵심 기능의 공통 사항으로 가정
// 구구단 클래스와 Rect클래스의 핵심 기능메소드 수행전 후 시간 출력

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

// 공통 기능 메소드 포함 (proxy의 절차를 구성하게 됨)

@Aspect // 공통 기능에 사용할 클래스
public class PerformanceAspect {
	
	// where과 같음 어디에 적용할 건지 지정
	@Pointcut("within(com.spring_aop.annotation.*)")
	private void pointcutMethod() { //annotation을 부착하고 이름을 사용하기 위한 용도 -> 빈 메소드 구성
		
	}
	
	@Around("pointcutMethod()") // when과 같음 핵심 기능 메소드 전에 시작하고 핵심 기능 위임
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		Signature s = joinPoint.getSignature(); // joinPoint의 정보 추출
		String methodName = s.getName(); // 핵심기능 메소드 이름 추출
		
		System.out.println("---------------------------------");
		System.out.println("[LOG]Before: " + methodName + "() : 실행 시작");
		System.out.println("---------------------------------");

		long startTime = System.nanoTime();
		Object result = null;
		
		try {
			result = joinPoint.proceed();
		}catch(Exception e) {
			System.out.println("[LOG]Exception: " + methodName);
		}
		
		long endTime = System.nanoTime();
		
		System.out.println("---------------------------------");
		System.out.println("[LOG]After: " + methodName + "() : 실행 종료");
		System.out.println("[LOG]: " + methodName + "() 실행시간 : " + (endTime - startTime) + "ns");
		System.out.println("---------------------------------");
	
		return result;
	}
}

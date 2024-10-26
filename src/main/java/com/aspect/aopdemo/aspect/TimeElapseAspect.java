package com.aspect.aopdemo.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class TimeElapseAspect {

    @Around("execution(* com.aspect.aopdemo.entity.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object objectToProceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - startTime;
        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
        return objectToProceed;
    }


}

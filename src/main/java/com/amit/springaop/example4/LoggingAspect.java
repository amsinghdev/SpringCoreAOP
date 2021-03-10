package com.amit.springaop.example4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(com.amit.springaop.example4.Log)")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] methodArgs = proceedingJoinPoint.getArgs();
        logger.info("call method "+methodName+" with args "+methodArgs[0]);
        Object result = proceedingJoinPoint.proceed();
        logger.info("Method "+methodName+" return "+result);
        return result;
    }
}

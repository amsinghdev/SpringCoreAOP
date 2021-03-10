package com.amit.springaop.example2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Before("execution(* * .*Passenger(..))")
    public void before() {
        logger.info("Entering Method");
    }

    @After("execution(* * .*Passenger(..))")
    public void after() {
        logger.info("Existing Method");
    }
}

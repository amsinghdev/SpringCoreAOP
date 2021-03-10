package com.amit.springaop.example1;

import java.util.logging.Logger;

public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    public void before1() {
        logger.info("Entering Method");
    }

    public void after1() {
        logger.info("Existing Method");
    }
}

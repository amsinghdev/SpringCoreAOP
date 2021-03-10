package com.amit.springaop.example1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassengerManager {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example1/aop.xml");
        PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDao");
        Passenger passenger = passengerDao.getPassenger(1);
        System.out.println(passenger.toString());
        context.close();
    }
}

package com.amit.springaop.example2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassengerManager {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example2/aop.xml");
        PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDao");
        Passenger passenger = passengerDao.getPassenger(1);
        System.out.println(passenger.toString());
        passengerDao.addPassenger(2);
        System.out.println("Passenger : 2 added successfully");
        context.close();
    }
}

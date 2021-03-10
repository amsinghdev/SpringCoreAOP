package com.amit.springaop.example3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassengerManager {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example3/aop.xml");
        PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDao");
        Passenger passenger = passengerDao.getPassenger(1);
        System.out.println(passenger.toString());
        Passenger passenger1 =passengerDao.addPassenger(3);
        System.out.println("Passenger : "+ passenger1.getId() + " added successfully");
        context.close();
    }
}

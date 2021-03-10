package com.amit.springaop.example1;

import java.util.HashMap;
import java.util.Map;

public class PassengerDaoImpl implements PassengerDao {

    private Map<Integer,Passenger> passengerMap = new HashMap<>();

    public Passenger getPassenger(int id) {

        if(null != passengerMap.get(id))
        return passengerMap.get(id);

        Passenger passenger = new Passenger(id);
        passengerMap.put(id,passenger);

        return passenger;
    }
}

package com.amit.springaop.example4;

import java.util.HashMap;
import java.util.Map;

public class PassengerDaoImpl implements PassengerDao {

    private Map<Integer, Passenger> passengerMap = new HashMap<>();

    @Log
    public Passenger getPassenger(int id) {

        if(null != passengerMap.get(id))
        return passengerMap.get(id);

        Passenger passenger = new Passenger(id);
        passengerMap.put(id,passenger);

        return passenger;
    }

    @Override
    @Log
    public Passenger addPassenger(int id) {
        Passenger passenger;
        if(passengerMap.get(id)==null) {
            passenger = new Passenger(id);
            passengerMap.put(id,passenger);
        }
        else {
            passenger = passengerMap.get(id);
        }
        return passenger;
    }
}

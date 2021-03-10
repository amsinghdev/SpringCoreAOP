package com.amit.springaop.example5;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

    private Map<Integer, Passenger> passengerMap = new HashMap<>();

    public Passenger getPassenger(int id) {

        if(null != passengerMap.get(id))
        return passengerMap.get(id);

        if(id<1) throw new RuntimeException("Id should be >1");

        Passenger passenger = new Passenger(id);
        passengerMap.put(id,passenger);

        return passenger;
    }

    @Override
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

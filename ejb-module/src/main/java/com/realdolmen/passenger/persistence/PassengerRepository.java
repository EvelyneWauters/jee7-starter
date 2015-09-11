package com.realdolmen.passenger.persistence;

import com.realdolmen.passenger.domain.Passenger;

import java.util.List;

/**
 * Created by EWTAX45 on 9/09/2015.
 */
public interface PassengerRepository {

    public List<Passenger> findAll();

    public void savePassenger(Passenger p);

    public Passenger findById(int id);

    public void updatePassenger(Passenger passenger);

    public void deletePassengerById(int id);

    List<String> findAllLastNames();

    int getTotalFrequentFlyerMiles();

    void deleteAllPassengers();
}

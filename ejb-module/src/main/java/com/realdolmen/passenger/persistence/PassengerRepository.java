package com.realdolmen.passenger.persistence;

import com.realdolmen.passenger.domain.Passenger;

import java.util.List;

/**
 * Created by EWTAX45 on 9/09/2015.
 */
public interface PassengerRepository {

    public List<Passenger> findAll();

    public void addPassenger(Passenger p);
}

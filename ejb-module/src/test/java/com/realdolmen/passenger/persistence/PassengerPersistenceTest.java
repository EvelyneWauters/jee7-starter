package com.realdolmen.passenger.persistence;

import com.realdolmen.course.persistence.PersistenceTest;
import com.realdolmen.passenger.domain.Passenger;
import com.realdolmen.passenger.domain.PassengerId;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by EWTAX45 on 9/09/2015.
 */
public class PassengerPersistenceTest extends PersistenceTest {

    @Test
    public void passengerCanBePersisted() throws Exception {
        Passenger passenger = new Passenger("Doctor", 8000);
        passenger.setPassengerId(new PassengerId("ssn", "Who"));
        entityManager().persist(passenger);
        assertNotNull(passenger.getId());
    }

    @Test
    public void returnAllPassengers() throws Exception  {
        List<Passenger> resultList = entityManager().createQuery("select p from Passenger p", Passenger.class).getResultList();
        assertNotNull(resultList);
    }
}

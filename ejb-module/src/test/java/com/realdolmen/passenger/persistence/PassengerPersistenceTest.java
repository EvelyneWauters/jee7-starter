package com.realdolmen.passenger.persistence;

import com.realdolmen.course.persistence.DataSetPersistenceTest;
import com.realdolmen.course.persistence.PersistenceTest;
import com.realdolmen.passenger.domain.Passenger;
import com.realdolmen.passenger.domain.PassengerType;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by EWTAX45 on 9/09/2015.
 */
public class PassengerPersistenceTest extends DataSetPersistenceTest {

    @Test
    public void passengerCanBePersisted() throws Exception {

        Calendar calendar = Calendar.getInstance();

        Passenger passenger = new Passenger(
                "ssn",
                "Fred",
                "Flinstone",
                new GregorianCalendar(1988,02,03),
                PassengerType.OCCASIONAL,
                new GregorianCalendar(2002,02,03,15,02),
                1 );
        entityManager().persist(passenger);
        assertNotNull(passenger.getId());
    }

    @Test
    public void testAgeIsCalculatedRight() throws Exception {
        Passenger passenger = entityManager().createQuery("select p from Passenger p where id=123", Passenger.class).getSingleResult();
        assertEquals(713, passenger.getAge());
    }

    @Test
    public void returnAllPassengers() throws Exception  {
        List<Passenger> resultList = entityManager().createQuery("select p from Passenger p", Passenger.class).getResultList();
        assertNotNull(resultList);
    }
}

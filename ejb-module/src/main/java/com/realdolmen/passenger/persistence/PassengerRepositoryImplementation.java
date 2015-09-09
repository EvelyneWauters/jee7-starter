package com.realdolmen.passenger.persistence;

import com.realdolmen.course.domain.Book;
import com.realdolmen.passenger.domain.Passenger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;



public class PassengerRepositoryImplementation implements PassengerRepository {
    @Override
    public List<Passenger> findAll() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("huh?");
        EntityManager em = null;

        try {
            em = entityManagerFactory.createEntityManager();
            return em.createQuery("select p from Passenger p", Passenger.class).getResultList();
        } finally   {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void addPassenger(Passenger p) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("huh?");
        EntityManager em = null;

        try {
            em = entityManagerFactory.createEntityManager();
            em.persist(p);

        } finally   {
            if (em != null) {
                em.close();
            }
        }
    }
}

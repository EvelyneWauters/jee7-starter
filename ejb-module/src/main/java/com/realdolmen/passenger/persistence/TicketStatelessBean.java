package com.realdolmen.passenger.persistence;

import com.realdolmen.passenger.domain.Passenger;
import com.realdolmen.passenger.domain.Ticket;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
@LocalBean
public class TicketStatelessBean implements TicketStatelessBeanInterface {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Ticket> findAllTickets() {
        return entityManager.createQuery("select t from Ticket t", Ticket.class).getResultList();
    }

    @Override
    public Ticket findById(int id)    {
        return entityManager.find(Ticket.class, id);
    }


    @Override
    public void createTicket(Ticket ticket) {
        entityManager.persist(ticket);
    }



    @Override
    public void updateTicket(Ticket ticket) {
        entityManager.find(Passenger.class, ticket.getId());
        entityManager.persist(ticket);
    }
}

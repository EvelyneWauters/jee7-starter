package com.realdolmen.course.controller;

import com.realdolmen.passenger.domain.Ticket;
import com.realdolmen.passenger.persistence.TicketStatelessBean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class TicketController {
    @Inject
    TicketStatelessBean ticketRepository;

    Ticket ticket = new Ticket();


    public List<Ticket> retrieveAllTickets()    {
        return ticketRepository.findAllTickets();
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}

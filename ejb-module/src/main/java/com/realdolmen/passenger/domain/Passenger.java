package com.realdolmen.passenger.domain;
import javax.persistence.*;
import java.time.Year;
import java.util.*;

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (nullable = false, updatable = false)
    private String ssn;

    @Column (length = 50)
    private String firstName;

    @Column (length = 50)
    private String lastName;

    @Enumerated
    private PassengerType passengerType;

    @Version
    private Integer version;

    @Column (nullable = false)
    private int frequentFlyerMiles;

    @OneToMany
    private List<Ticket> ticket = new ArrayList<>();


    public Passenger() {
    }

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }


    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public int getFrequentFlyerMiles() {
        return frequentFlyerMiles;
    }

    public void setFrequentFlyerMiles(int frequentFlyerMiles) {
        this.frequentFlyerMiles = frequentFlyerMiles;
    }

    public List<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(List<Ticket> ticket) {
        this.ticket = ticket;
    }
}

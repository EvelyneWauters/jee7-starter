package com.realdolmen.passenger.domain;
import javax.persistence.*;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

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

    @Temporal(TemporalType.DATE)
    @Column (updatable = false)
    private Calendar dateOfBirth;

    @Transient
    private int age;

    @Enumerated (EnumType.STRING)
    @Column (nullable = false)
    private PassengerType passengerType;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar lastFlight;

    private Integer frequentFlyerMiles;

    @Embedded
    private CreditCard creditCard;

    @Embedded
    private Address address;

    @ElementCollection
    private List<String> preferences;


    public Passenger() {
    }

    public Passenger(String ssn, String firstName, String lastName, Calendar dateOfBirth, PassengerType passengerType, Calendar lastFlight, Integer frequentFlyerMiles) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.passengerType = passengerType;
        this.lastFlight = lastFlight;
        this.frequentFlyerMiles = frequentFlyerMiles;
    }

    public Integer getId() {
        return id;
    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

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

    public Integer getFrequentFlyerMiles() {
        return frequentFlyerMiles;
    }

    public void setFrequentFlyerMiles(Integer frequentFlyerMiles) {
        this.frequentFlyerMiles = frequentFlyerMiles;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        this.setAge();
        return this.age;
    }

    public void setAge() {
        this.age = this.getDateOfBirth().YEAR -  (new GregorianCalendar()).YEAR;
    }

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }

    public Calendar getLastFlight() {
        return lastFlight;
    }

    public void setLastFlight(Calendar lastFlight) {
        this.lastFlight = lastFlight;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

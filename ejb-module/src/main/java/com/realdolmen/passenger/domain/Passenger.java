package com.realdolmen.passenger.domain;

import javax.persistence.*;

@Entity
@SecondaryTables({
@SecondaryTable(name = "passenger_meta")})
public class Passenger {
    @EmbeddedId
    private PassengerId passengerId;

    private String firstName;

    @Column(table = "passenger_meta")
    private Integer frequentFlyerMiles;

    @Column(table = "passenger_meta")
    @Basic(fetch = FetchType.LAZY)
    @Lob
    private byte[] picture;


    public Passenger() {
    }

    public Passenger(String firstName, Integer frequentFlyerMiles) {
        this.firstName = firstName;
        this.frequentFlyerMiles = frequentFlyerMiles;
    }

    public PassengerId getId() {
        return passengerId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getFrequentFlyerMiles() {
        return frequentFlyerMiles;
    }

    public void setFrequentFlyerMiles(Integer frequentFlyerMiles) {
        this.frequentFlyerMiles = frequentFlyerMiles;
    }

    public PassengerId getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(PassengerId passengerId) {
        this.passengerId = passengerId;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}

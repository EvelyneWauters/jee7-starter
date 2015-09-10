package com.realdolmen.passenger.domain;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Created by EWTAX45 on 10/09/2015.
 */


@Embeddable
public class CreditCard {

    private String number;
    private String expiryDate;
    private Integer controlNumber;
    @Enumerated (EnumType.STRING)
    private CreditCardType creditCardType;

    public CreditCard() {
    }

    public CreditCard(String number, String expiryDate, Integer controlNumber) {
        this.number = number;
        this.expiryDate = expiryDate;
        this.controlNumber = controlNumber;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(Integer controlNumber) {
        this.controlNumber = controlNumber;
    }
}

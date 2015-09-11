package com.realdolmen.passenger.domain;

import javax.persistence.*;

/**
 * Created by EWTAX45 on 11/09/2015.
 */

@Entity
public class Ticket {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private int price;


    public Ticket() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

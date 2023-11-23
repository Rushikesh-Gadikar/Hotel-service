package com.org.rush.hotelserice.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "hotel")
@Entity
@Data
public class Hotel {

    @Id
    @Column(name = "HotelID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int hotelID;

    @Column(name = "HotelName")
    private String hotelName;

    @Column(name = "Location")
    private String location;

    @Column(name = "About")
    private String about;
}

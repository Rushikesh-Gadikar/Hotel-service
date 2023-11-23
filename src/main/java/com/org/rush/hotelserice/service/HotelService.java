package com.org.rush.hotelserice.service;

import com.org.rush.hotelserice.entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    public Hotel saveHotel(Hotel hotel);

    public Hotel getHotel(int id);

    public List<Hotel> getAllHotels();
}

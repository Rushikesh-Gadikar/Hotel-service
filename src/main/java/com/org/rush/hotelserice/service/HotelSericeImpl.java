package com.org.rush.hotelserice.service;

import com.org.rush.hotelserice.entity.Hotel;
import com.org.rush.hotelserice.exception.ResourceNotFoundException;
import com.org.rush.hotelserice.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelSericeImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotel(int id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Resource not found with given id " + id));
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }
}

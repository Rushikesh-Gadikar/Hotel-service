package com.org.rush.hotelserice.controller;

import com.org.rush.hotelserice.entity.Hotel;
import com.org.rush.hotelserice.service.HotelSericeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
@CrossOrigin(origins = "*")
public class hotelController {

    @Autowired
    private HotelSericeImpl hotelSerice;

    @PostMapping("/save")
    public ResponseEntity<Hotel> saveHotelData(@RequestBody Hotel hotel){
        return new ResponseEntity<>(hotelSerice.saveHotel(hotel), HttpStatus.OK);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotelData(@PathVariable(value = "hotelId") int id){
        return new ResponseEntity<>(hotelSerice.getHotel(id),HttpStatus.FOUND);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Hotel>> getAllHotelData(){
        return new ResponseEntity<>(hotelSerice.getAllHotels(),HttpStatus.OK);
    }
}

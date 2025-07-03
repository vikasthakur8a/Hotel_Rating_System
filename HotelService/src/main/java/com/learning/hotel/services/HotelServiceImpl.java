package com.learning.hotel.services;

import com.learning.hotel.entities.Hotel;
import com.learning.hotel.exception.ResourceNotFoundException;
import com.learning.hotel.repositories.HotelRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRespository hotelRespository;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRespository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRespository.findAll();
    }

    @Override
    public Hotel getHotel(String id) {
        return hotelRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel not found !!"));
    }

    @Override
    public Hotel updateHotel(String id, Hotel hotel) {
        return null;
    }

    @Override
    public void deleteHotel(String id) {

    }
}

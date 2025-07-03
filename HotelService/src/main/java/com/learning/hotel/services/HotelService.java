package com.learning.hotel.services;


import com.learning.hotel.entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel getHotel(String id);

    Hotel updateHotel(String id, Hotel hotel);

    void deleteHotel(String id);

}

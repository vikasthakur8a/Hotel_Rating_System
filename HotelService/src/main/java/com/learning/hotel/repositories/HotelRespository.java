package com.learning.hotel.repositories;

import com.learning.hotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRespository extends JpaRepository<Hotel, String> {
}

package com.learning.rating.services;

import com.learning.rating.entity.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {
    //create
    Rating create(Rating rating);

    //get all ratings
    List<Rating> getRating();

    //get all by UserId
    List<Rating> getRatingByUserId(String userId);

    //get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);
}

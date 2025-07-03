package com.learning.user.service.externals.services;

import com.learning.user.service.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@Service
@FeignClient(name = "RATING-SERVICE")
public interface RatingService {


    //get
    @GetMapping("ratings/ratingId")
    Rating getRating(@PathVariable String ratingId);

    //POST
    @PostMapping("/ratings")
    ResponseEntity<Rating> createRating(Rating values);


    //PUT
    @PutMapping("/ratings/{ratingId}")
    ResponseEntity<Rating> updateRating(@PathVariable("ratingId") String ratingId, Rating rating);


    @DeleteMapping("/ratings/{ratingId}")
    void deleteRating(@PathVariable String ratingId);
}
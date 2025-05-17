package com.dukorane.Dukorane_backend.controller;

import com.dukorane.Dukorane_backend.model.Review;
import com.dukorane.Dukorane_backend.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController (ReviewService reviewService){
        this.reviewService = reviewService;
    }

    @PostMapping("/review")
    public Review saveReview (@RequestBody Review review){
        return reviewService.saveReview(review);
    }

    @GetMapping("/reviews")
    public List<Review> reviewList(){
        return reviewService.getAllReviews();
    }

    @GetMapping("/review/{id}")
    public Review findById(@PathVariable ("id")UUID id){
        return reviewService.getReviewById(id);
    }

    @PutMapping("/update/review/{id}")
    public Review updateReview(@PathVariable ("id")UUID id, @RequestBody Review review){
        return reviewService.updateReview(id, review);
    }

    @DeleteMapping("/delete/review/{id}")
    public void deleteById (@PathVariable ("id") UUID id){
        reviewService.deleteById(id);
    }
}

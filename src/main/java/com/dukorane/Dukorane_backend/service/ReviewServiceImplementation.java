package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Review;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class ReviewServiceImplementation implements ReviewService{
    @Override
    public List<Review> getAllReviews() {
        return null;
    }

    @Override
    public Review getReviewById(UUID id) {
        return null;
    }

    @Override
    public Review saveReview(Review review) {
        return null;
    }

    @Override
    public Review updateReview(UUID id, Review review) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }

}

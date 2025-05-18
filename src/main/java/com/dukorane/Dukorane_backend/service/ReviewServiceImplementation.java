package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Review;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImplementation implements ReviewService{
    @Override
    public List<Review> getAllReviews() {
        return null;
    }

    @Override
    public Review getReviewById(Long id) {
        return null;
    }

    @Override
    public Review saveReview(Review review) {
        return null;
    }

    @Override
    public Review updateReview(Long id, Review review) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

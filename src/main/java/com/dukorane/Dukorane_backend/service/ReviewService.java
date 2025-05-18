package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Review;

import java.util.List;
import java.util.UUID;

public interface ReviewService {
    List<Review> getAllReviews ();
    Review getReviewById (Long id);
    Review saveReview (Review review);
    Review updateReview (Long id, Review review);
    void deleteById (Long id);
}

package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Review;
import com.dukorane.Dukorane_backend.repository.ReviewRepository;
import com.dukorane.Dukorane_backend.repository.UserRepository;
import com.dukorane.Dukorane_backend.repository.WorkerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImplementation implements ReviewService{
    private final ReviewRepository reviewRepository;
    private final WorkerProfileRepository workerProfileRepository;
    private final UserRepository userRepository;

    @Autowired
    public ReviewServiceImplementation(ReviewRepository reviewRepository, WorkerProfileRepository workerProfileRepository, UserRepository userRepository) {
        this.reviewRepository = reviewRepository;
        this.workerProfileRepository = workerProfileRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Review> getAllReviews() {
        return null;
    }

    @Override
    public Review getReviewById(Long id) {
        return null;
    }

    @Override
    public Review saveReview(Review review, Long workerId, Long employerId) {
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

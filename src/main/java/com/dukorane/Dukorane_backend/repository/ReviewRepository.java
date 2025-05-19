package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReviewRepository extends JpaRepository <Review, Long> {
    Review findReviewById(Long id);
}

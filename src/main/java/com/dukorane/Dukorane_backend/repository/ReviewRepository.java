package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository <Review, UUID> {
}

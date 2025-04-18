package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository <User, UUID>{
}

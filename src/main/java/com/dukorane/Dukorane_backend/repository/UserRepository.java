package com.dukorane.Dukorane_backend.repository;

import com.dukorane.Dukorane_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{
    User findUserById(Long id);
}

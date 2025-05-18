package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> getAllUsers ();
    User getUserById (Long id);
    User saveUser (User user);
    User updateUser (Long id, User user);
    void deleteById (Long id);
}

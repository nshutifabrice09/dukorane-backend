package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> getAllUsers ();
    User getUserById (UUID id);
    User saveUser (User user);
    User updateUser (UUID id, User user);
    void removeById (UUID id);
}

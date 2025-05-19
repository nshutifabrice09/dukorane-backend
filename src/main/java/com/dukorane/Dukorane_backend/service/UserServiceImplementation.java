package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.User;
import com.dukorane.Dukorane_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        User existUser = userRepository.findUserById(id);
        if(existUser != null){
            existUser.setFullName(user.getFullName());
            existUser.setPhoneNumber(user.getPhoneNumber());
            existUser.setPassword(user.getPassword());
            existUser.setRole(user.getRole());
            existUser.setLocation(user.getLocation());
            existUser.setCreatedAt(user.getCreatedAt());
            return userRepository.save(user);
        }

        return null;
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}

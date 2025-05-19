package com.dukorane.Dukorane_backend.controller;

import com.dukorane.Dukorane_backend.model.User;
import com.dukorane.Dukorane_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public User save(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> userList(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable ("id") Long id){
        return userService.getUserById(id);
    }

    @PutMapping("/user/user/{id}")
    public User updateUser(@RequestBody User user, @PathVariable ("id") Long id){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/users/user/{id}")
    public void removeById(@PathVariable ("id") Long id){
        userService.deleteById(id);
    }
}


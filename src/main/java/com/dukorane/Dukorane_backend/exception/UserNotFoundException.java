package com.dukorane.Dukorane_backend.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException (Long id){
        super("Could not find a User with id "+id);
    }
}

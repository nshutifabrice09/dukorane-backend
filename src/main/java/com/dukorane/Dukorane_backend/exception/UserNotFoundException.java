package com.dukorane.Dukorane_backend.exception;

import java.util.UUID;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException (UUID id){
        super("Could not find a User with id "+id);
    }
}

package com.dukorane.Dukorane_backend.exception;

import com.dukorane.Dukorane_backend.model.Application;

import java.util.UUID;

public class ApplicationNotFoundException extends RuntimeException{

    public ApplicationNotFoundException (UUID id){
        super("Could not find the Application with id "+id);
    }

}

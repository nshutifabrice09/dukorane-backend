package com.dukorane.Dukorane_backend.exception;


public class ApplicationNotFoundException extends RuntimeException{

    public ApplicationNotFoundException (Long id){
        super("Could not find the Application with id "+id);
    }

}

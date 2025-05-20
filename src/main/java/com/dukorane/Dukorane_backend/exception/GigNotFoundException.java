package com.dukorane.Dukorane_backend.exception;

public class GigNotFoundException extends RuntimeException{
    public GigNotFoundException (Long id){
        super("Could not find a Gig with id "+id);
    }
}

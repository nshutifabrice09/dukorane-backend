package com.dukorane.Dukorane_backend.exception;

import java.util.UUID;

public class GigNotFoundException extends RuntimeException{
    public GigNotFoundException (Long id){
        super("Could not find a Gig with id "+id);
    }
}

package com.dukorane.Dukorane_backend.exception;

import java.util.UUID;

public class ReviewNotFoundException extends RuntimeException{

    public ReviewNotFoundException(Long id){
        super ("Couldn't find a Review with id "+id);
    }
}

package com.dukorane.Dukorane_backend.exception;

import java.util.UUID;

public class WorkerProfileNotFoundException extends RuntimeException{
    public WorkerProfileNotFoundException (UUID id){
        super("Could not find a Worker Profile with id "+id);
    }
}

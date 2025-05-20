package com.dukorane.Dukorane_backend.exception;
public class WorkerProfileNotFoundException extends RuntimeException{
    public WorkerProfileNotFoundException (Long id){
        super("Could not find a Worker Profile with id "+id);
    }
}

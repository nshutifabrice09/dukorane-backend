package com.dukorane.Dukorane_backend.exception;

import java.util.UUID;

public class CertificationNotFoundException extends RuntimeException{

    public CertificationNotFoundException (Long id){
        super("Could not find the Certification with id " +id);
    }
}

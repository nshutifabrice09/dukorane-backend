package com.dukorane.Dukorane_backend.exception;

public class PortfolioNotFoundException extends RuntimeException{

    public PortfolioNotFoundException (Long id) {
        super ("Could not find a Portfolio with id "+id);

    }
}

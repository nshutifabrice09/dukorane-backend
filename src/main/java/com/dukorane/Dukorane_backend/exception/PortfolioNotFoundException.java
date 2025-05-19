package com.dukorane.Dukorane_backend.exception;

import java.util.UUID;

public class PortfolioNotFoundException extends RuntimeException{

    public PortfolioNotFoundException (Long id) {
        super ("Could not find a Portfolio with id "+id);

    }
}

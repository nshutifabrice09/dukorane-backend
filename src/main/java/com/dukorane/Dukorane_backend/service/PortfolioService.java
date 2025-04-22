package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Portfolio;

import java.util.List;
import java.util.UUID;

public interface PortfolioService {
    List<Portfolio> getAllPortfolios ();
    Portfolio getPortfolioById (UUID id);
    Portfolio savePortfolio (Portfolio portfolio);
    Portfolio updatePortfolio (UUID id, Portfolio portfolio);
    void deleteById(UUID id);
}

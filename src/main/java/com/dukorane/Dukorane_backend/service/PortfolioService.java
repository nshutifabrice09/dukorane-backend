package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Portfolio;

import java.util.List;
import java.util.UUID;

public interface PortfolioService {
    List<Portfolio> getAllPortfolios ();
    Portfolio getPortfolioById (Long id);
    Portfolio savePortfolio (Portfolio portfolio, Long workerId);
    Portfolio updatePortfolio (Long id, Portfolio portfolio);
    void deleteById(Long id);
}

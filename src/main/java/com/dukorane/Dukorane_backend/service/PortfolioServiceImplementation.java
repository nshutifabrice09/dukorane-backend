package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Portfolio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class PortfolioServiceImplementation implements PortfolioService{
    @Override
    public List<Portfolio> getAllPortfolios() {
        return null;
    }

    @Override
    public Portfolio getPortfolioById(UUID id) {
        return null;
    }

    @Override
    public Portfolio savePortfolio(Portfolio portfolio) {
        return null;
    }

    @Override
    public Portfolio updatePortfolio(UUID id, Portfolio portfolio) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }

}

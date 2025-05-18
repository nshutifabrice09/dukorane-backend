package com.dukorane.Dukorane_backend.service;

import com.dukorane.Dukorane_backend.model.Portfolio;
import com.dukorane.Dukorane_backend.repository.PortfolioRepository;
import com.dukorane.Dukorane_backend.repository.WorkerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioServiceImplementation implements PortfolioService{

    private final PortfolioRepository portfolioRepository;
    private final WorkerProfileRepository workerProfileRepository;

    @Autowired
    public PortfolioServiceImplementation(PortfolioRepository portfolioRepository, WorkerProfileRepository workerProfileRepository) {
        this.portfolioRepository = portfolioRepository;
        this.workerProfileRepository = workerProfileRepository;
    }

    @Override
    public List<Portfolio> getAllPortfolios() {
        return portfolioRepository.findAll();
    }

    @Override
    public Portfolio getPortfolioById(Long id) {
        return portfolioRepository.findPortolioById(id);
    }

    @Override
    public Portfolio savePortfolio(Portfolio portfolio, Long workerId) {
        return null;
    }

    @Override
    public Portfolio updatePortfolio(Long id, Portfolio portfolio) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

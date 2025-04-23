package com.dukorane.Dukorane_backend.controller;

import com.dukorane.Dukorane_backend.model.Portfolio;
import com.dukorane.Dukorane_backend.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sound.sampled.Port;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class PortfolioController {

    private final PortfolioService portfolioService;

    @Autowired
    public PortfolioController(PortfolioService portfolioService){
        this.portfolioService = portfolioService;
    }

    @PostMapping("/portfolio")
    public Portfolio save (@RequestBody Portfolio portfolio){
        return portfolioService.savePortfolio(portfolio);
    }

    @GetMapping("/portfolios")
    public List<Portfolio> portfolioList(){
        return portfolioService.getAllPortfolios();
    }

    @GetMapping("/portfolio/{id}")
    public Portfolio findById(@PathVariable ("id")UUID id){
        return portfolioService.getPortfolioById(id);
    }

    @PutMapping("/update/portfolio/{id}")
    public Portfolio updaPortfolio(@PathVariable ("id") UUID id, @RequestBody Portfolio portfolio){
        return portfolioService.updatePortfolio(id, portfolio);
    }

    @DeleteMapping("/delete/portfolio/{id}")
    public void deleteById(@PathVariable ("id")UUID id){
        portfolioService.deleteById(id);
    }
}

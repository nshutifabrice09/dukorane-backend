package com.dukorane.Dukorane_backend.controller;

import com.dukorane.Dukorane_backend.model.Portfolio;
import com.dukorane.Dukorane_backend.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class PortfolioController {

    private final PortfolioService portfolioService;

    @Autowired
    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @PostMapping("/portfolio/{workerId}")
    public Portfolio save(@RequestBody Portfolio portfolio, @PathVariable ("workerId") Long workerId){
        return portfolioService.savePortfolio(portfolio, workerId);
    }

    @GetMapping("/portfolios")
    public List<Portfolio> portfolioList(){
        return portfolioService.getAllPortfolios();
    }

    @GetMapping("/portfolio/{id}")
    public Portfolio getPortfolio(@PathVariable ("id") Long id){
        return portfolioService.getPortfolioById(id);
    }

    @PutMapping("/update/portfolio/{id}")
    public Portfolio updatePortfolio(@PathVariable("id") Long id, @RequestBody Portfolio portfolio){
        return portfolioService.updatePortfolio(id, portfolio);
    }

    @DeleteMapping("/delete/portfolio/{id}")
    public void removePortfolio(@PathVariable("id") Long id){
        portfolioService.deleteById(id);
    }
}

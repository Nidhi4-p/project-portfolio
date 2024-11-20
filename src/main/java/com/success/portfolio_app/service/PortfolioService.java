package com.success.portfolio_app.service;


import com.success.portfolio_app.DTO.UserResponse;
import com.success.portfolio_app.model.User;
import com.success.portfolio_app.modelPortfolio.Portfolio;
import com.success.portfolio_app.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    public Portfolio savePortfolio(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    public Portfolio getPortfolio(String username) {
        Portfolio portfolio = portfolioRepository.findByUsername(username);
        return portfolio;
    }
}

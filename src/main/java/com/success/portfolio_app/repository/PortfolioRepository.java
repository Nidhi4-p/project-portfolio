package com.success.portfolio_app.repository;

import com.success.portfolio_app.model.User;
import com.success.portfolio_app.modelPortfolio.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    // Custom query methods can go here
    Portfolio findByUsername(String username);
}

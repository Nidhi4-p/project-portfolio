package com.success.portfolio_app.controller;


import com.success.portfolio_app.modelPortfolio.Experience_Portfolio;
import com.success.portfolio_app.modelPortfolio.Portfolio;
import com.success.portfolio_app.model.User;
import com.success.portfolio_app.modelPortfolio.Projects_Portfolio;
import com.success.portfolio_app.modelPortfolio.Skills_Portfolio;
import com.success.portfolio_app.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/portfolio")
@CrossOrigin(origins = "http://localhost:3000")
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    // Register and create a portfolio for a user
    @PostMapping("/create")
    public Portfolio createPortfolio(@RequestBody Portfolio portfolio) {
        if (portfolio.getSkill_list() != null) {
            List<Skills_Portfolio> skillCopy = new ArrayList<>(portfolio.getSkill_list());
            for (Skills_Portfolio skill : skillCopy) {
                portfolio.addSkill(skill); // Set portfolio reference through helper method
            }
        }

        if (portfolio.getProject_list() != null) {
            List<Projects_Portfolio> projectCopy = new ArrayList<>(portfolio.getProject_list());
            for (Projects_Portfolio project : projectCopy) {
                portfolio.addProject(project); // Set portfolio reference through helper method
            }
        }

        if (portfolio.getExperience_Portfolio() != null) {
            List<Experience_Portfolio> experienceCopy = new ArrayList<>(portfolio.getExperience_Portfolio());
            for (Experience_Portfolio experience : experienceCopy) {
                portfolio.addExperience(experience); // Set portfolio reference through helper method
            }
        }
        return portfolioService.savePortfolio(portfolio);
    }

    // Retrieve the public portfolio for a user
    @GetMapping("/{username}")
    public Portfolio getPortfolio(@PathVariable String username) {
        return portfolioService.getPortfolio(username);
   }
}

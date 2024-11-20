package com.success.portfolio_app.modelPortfolio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.success.portfolio_app.model.User;
import jakarta.persistence.*;

@Entity
@Table(name = "Projects_Portfolio")
public class Projects_Portfolio {

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    @JsonIgnore
    private Portfolio portfolio;

    @Column(name = "project_name", nullable = true)
    private String projectName;

    @Column(name = "description",nullable = true)
    private String description;

    @Column(name = "url",nullable = true)
    private String url;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}


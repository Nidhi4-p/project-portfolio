package com.success.portfolio_app.modelPortfolio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Table(name = "Portfolio")
public class Portfolio {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "fullName", nullable = false)
    private String fullName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "about_me", nullable = false)
    private String about_me;

    @Column(name = "mobile", nullable = false)
    private Long mobile;

    //@Column(name = "skills", nullable = false)
    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Skills_Portfolio> skill_list;

    //@Column(name = "projects", nullable = false)
    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Projects_Portfolio> project_list;

    //@Column(name = "experience", nullable = false)
    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Experience_Portfolio> Experience_Portfolio;

    @Column(name = "linkedin")
    private String linkedin;

    @Column(name = "github")
    private String github;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAbout_me() {
        return about_me;
    }

    public void setAbout_me(String about_me) {
        this.about_me = about_me;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public List<Skills_Portfolio> getSkill_list() {
        return skill_list;
    }

    public void setSkill_list(List<Skills_Portfolio> skill_list) {
        this.skill_list = skill_list;
    }

    public List<Projects_Portfolio> getProject_list() {
        return project_list;
    }

    public void setProject_list(List<Projects_Portfolio> project_list) {
        this.project_list = project_list;
    }

    public List<com.success.portfolio_app.modelPortfolio.Experience_Portfolio> getExperience_Portfolio() {
        return Experience_Portfolio;
    }

    public void setExperience_Portfolio(List<com.success.portfolio_app.modelPortfolio.Experience_Portfolio> experience_Portfolio) {
        Experience_Portfolio = experience_Portfolio;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public void addSkill(Skills_Portfolio skill) {
        skill.setPortfolio(this); // Set the portfolio reference
        this.skill_list.add(skill);
    }

    public void addProject(Projects_Portfolio project) {
        project.setPortfolio(this); // Set the portfolio reference
        this.project_list.add(project);
    }

    public void addExperience(Experience_Portfolio experience) {
        experience.setPortfolio(this); // Set the portfolio reference
        this.Experience_Portfolio.add(experience);
    }
}

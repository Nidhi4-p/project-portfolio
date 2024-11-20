package com.success.portfolio_app.modelPortfolio;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.success.portfolio_app.model.User;
import jakarta.persistence.*;

@Entity
@Table(name = "Skills_Portfolio")
public class Skills_Portfolio {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    @JsonIgnore
    private Portfolio portfolio;

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    @Column(name = "skill_name", nullable = false)
    private String skillName;

    @Column(name = "proficiency")
    private String proficiency;

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

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }


}

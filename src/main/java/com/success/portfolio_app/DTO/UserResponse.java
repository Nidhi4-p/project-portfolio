package com.success.portfolio_app.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;


public class UserResponse {

    @JsonIgnore
    private Long id;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @JsonIgnore
    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "public_profile_url", unique = true)
    private String publicProfileUrl;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPublicProfileUrl() {
        return publicProfileUrl;
    }

    public void setPublicProfileUrl(String publicProfileUrl) {
        this.publicProfileUrl = publicProfileUrl;
    }
}

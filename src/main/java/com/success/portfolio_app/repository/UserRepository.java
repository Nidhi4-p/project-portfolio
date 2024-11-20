package com.success.portfolio_app.repository;

import com.success.portfolio_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods can go here
    User findByUsername(String username);
}

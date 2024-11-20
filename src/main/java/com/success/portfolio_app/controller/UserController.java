package com.success.portfolio_app.controller;

import com.success.portfolio_app.DTO.UserResponse;
import com.success.portfolio_app.model.User;
import com.success.portfolio_app.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

//@RestController
//@RequestMapping("/api/users")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    @Operation(summary = "Get all users", description = "Returns a list of all users with their portfolios.")

    public UserResponse getUser(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @PostMapping
    @Operation(summary = "Create users", description = "Returns a list of all users with their portfolios.")

    public User createUser(@RequestBody User user) {
        String publicProfileUrl = "https://portfolio.com/" + UUID.randomUUID().toString();
        user.setPublicProfileUrl(publicProfileUrl);
        return userService.saveUser(user);
    }

    // Other endpoints for managing portfolio sections (Skills, Experience, etc.)
}

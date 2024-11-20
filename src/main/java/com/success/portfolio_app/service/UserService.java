package com.success.portfolio_app.service;


import com.success.portfolio_app.DTO.UserResponse;
import com.success.portfolio_app.model.User;
import com.success.portfolio_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private UserResponse userResponse;

    public UserResponse getUserByUsername(String username) {
        User userFromDB = userRepository.findByUsername(username);
        UserResponse userResponse = new UserResponse();
        userResponse.setUsername(userFromDB.getUsername());
        userResponse.setPublicProfileUrl(userFromDB.getPublicProfileUrl());
        return userResponse;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Other business logic methods can go here
}

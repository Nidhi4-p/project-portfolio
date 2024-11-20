package com.success.portfolio_app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/**").permitAll() // Publicly accessible URLs
                        .anyRequest().authenticated() // Secure other endpoints
                )
                .httpBasic(httpBasic -> httpBasic.disable()) // Disable HTTP Basic Auth (remove if you need Basic Auth)
                .csrf(csrf -> csrf.disable()); // Disable CSRF protection (use with caution)

        return http.build();
    }

//    @Bean
//    public UserDetailsService userDetailsService() {
//        // Sample in-memory user details
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername("admin").password("{noop}admin").roles("USER").build());
//        return manager;
//    }
}
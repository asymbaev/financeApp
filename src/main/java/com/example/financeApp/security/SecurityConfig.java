package com.example.financeApp.security;

import com.example.financeApp.exception.AuthEntryPoint;
import com.example.financeApp.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.AuthenticationEntryPoint;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private AuthenticationFilter authenticationFilter;
    @Autowired
    private AuthEntryPoint
}

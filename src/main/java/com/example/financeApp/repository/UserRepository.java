package com.example.financeApp.repository;

import com.example.financeApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByAmount(double amount);
    Optional<User> findUserByUsername(String username);
}

package com.example.financeApp.repository;

import com.example.financeApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByAmount(double amount);
    Optional<User> findUserByUsername(String username);
}

package com.example.financeApp.service;

import com.example.financeApp.entity.Amount;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getUser() {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User updateUserById(Long id, User user) {
        return null;
    }

    @Override
    public User matchUserByAmount(Amount amount) {
        return null;
    }
}

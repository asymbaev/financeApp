package com.example.financeApp.service;


import com.example.financeApp.entity.Amount;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService {

    List<User> getUser();

    User getUserById(Long id);

    User addUser(User user);
    void deleteUser(Long id);
    User updateUserById(Long id, User user);

    User matchUserByAmount(Amount amount);




}

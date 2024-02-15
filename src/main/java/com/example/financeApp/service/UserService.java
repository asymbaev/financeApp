package com.example.financeApp.service;


import com.example.financeApp.entity.Amount;
import com.example.financeApp.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService {

    List<User> getUsers();

    User getUserById(Long id);

    User addUser(User user);

    void deleteUserById(Long id);

    User updateUserById(Long id, User user);

    User matchUserByAmount(Amount amount);




}

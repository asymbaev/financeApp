package com.example.financeApp.service;

import com.example.financeApp.entity.Amount;
import com.example.financeApp.entity.User;
import com.example.financeApp.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            throw new EntityNotFoundException("User with id " + id + " not found");
        }
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {

        userRepository.deleteById(id);

    }

    @Override
    public User updateUserById(Long id, User user) {
        User existingUser = getUserById(id);
        existingUser.setUserId(user.getUserId());
        existingUser.setAmount(user.getAmount());
        existingUser.setUsername(user.getUsername());
        existingUser.setPassword(user.getPassword());
        userRepository.save(existingUser);
        return existingUser;
    }

    @Override
    public User matchUserByAmount(Amount amount) {
        List<User> userWithSameAmount = userRepository.findByAmount(amount.getValue());

        if (userWithSameAmount.size() >= 2) {
            notifyMatchedUsers(userWithSameAmount);
        }
        return userWithSameAmount.isEmpty() ? null : userWithSameAmount.get(0);

    }
    private void notifyMatchedUsers(List<User> matchedUsers) {
        // Implementing logic to notify matched users
        for (User user : matchedUsers) {
            // Sending a message or perform any desired action
            System.out.println("Matched User: " + user.getUserId());
        }
    }
}

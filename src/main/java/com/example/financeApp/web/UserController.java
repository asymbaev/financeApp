package com.example.financeApp.web;


import com.example.financeApp.entity.Amount;
import com.example.financeApp.entity.User;
import com.example.financeApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/matchByAmount")
    public ResponseEntity<User> matchUserByAmount (@RequestBody Amount amount) {
        User matchedUser = userService.matchUserByAmount(amount);
        return ResponseEntity.ok(matchedUser);
    }
}

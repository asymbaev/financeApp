package com.example.financeApp.web;


import com.example.financeApp.entity.Amount;
import com.example.financeApp.entity.User;
import com.example.financeApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v3/users")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK); //200
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete{id}")
    public ResponseEntity<User> deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @PutMapping("/id")
    public ResponseEntity<User> updateUserById(@PathVariable Long id, @RequestBody User user) {
        return new ResponseEntity<>(userService.updateUserById(id, user),HttpStatus.ACCEPTED);
    }


    @PostMapping("/matchByAmount")
    public ResponseEntity<User> matchUserByAmount (@RequestBody Amount amount) {
        User matchedUser = userService.matchUserByAmount(amount);
        return ResponseEntity.ok(matchedUser);
    }
}

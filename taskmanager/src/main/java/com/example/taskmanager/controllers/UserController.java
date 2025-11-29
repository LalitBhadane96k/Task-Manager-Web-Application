package com.example.taskmanager.controllers;

import com.example.taskmanager.entity.User;
import com.example.taskmanager.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;
    public UserController(UserRepository userRepository) { this.userRepository = userRepository; }

    @GetMapping
    public List<User> getAllUsers() { return userRepository.findAll(); }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) { return userRepository.save(user); }
}

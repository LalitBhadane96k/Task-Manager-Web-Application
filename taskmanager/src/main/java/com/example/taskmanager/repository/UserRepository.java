package com.example.taskmanager.repository;

import com.example.taskmanager.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}


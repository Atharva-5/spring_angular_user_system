package com.example.authApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.authApp.entity.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

// JpaRepository already provides:

// save()
// findAll()
// findById()
// delete()

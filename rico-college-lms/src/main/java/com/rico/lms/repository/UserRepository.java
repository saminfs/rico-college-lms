package com.rico.lms.repository;

import com.rico.lms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
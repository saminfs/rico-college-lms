package com.rico.lms.entity;

import jakarta.persistence.*;

@Entity // Tells Spring Boot this class is a database table
@Table(name = "users") // Database table name = users
public class User {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private Long id;

    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING) // Saves role as text: ADMIN, TEACHER, STUDENT
    private Role role;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }
}
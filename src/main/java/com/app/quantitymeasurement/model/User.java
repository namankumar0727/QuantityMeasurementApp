package com.app.quantitymeasurement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String username; // ✅ NOW USED AS EMAIL

    private String password;

    private String fullName; // ✅ NEW FIELD (optional but recommended)

    private String role;
}
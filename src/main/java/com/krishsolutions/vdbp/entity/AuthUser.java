package com.krishsolutions.vdbp.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(
        name = "auth_users",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_auth_users_mobile",
                        columnNames = "mobile_number"
                )
        }
)
public class AuthUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false, length = 100)
    private String fullName;

    @Column(name = "mobile_number", nullable = false,
            unique = true, length = 10)
    private String mobileNumber;

    @Column(name = "password_hash", nullable = false, length = 100)
    private String passwordHash;

    @Column(name = "mobile_verified", nullable = false)
    private boolean mobileVerified = false;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    protected AuthUser() {
        // Required by JPA
    }

    public AuthUser(String fullName, String mobileNumber,
                String passwordHash) {
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
        this.passwordHash = passwordHash;
        this.mobileVerified = false;
    }

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public boolean isMobileVerified() {
        return mobileVerified;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setMobileVerified(boolean mobileVerified) {
        this.mobileVerified = mobileVerified;
    }
}
package com.krishsolutions.vdbp.dto;

public record SignupResponse(
        Long userId,
        String fullName,
        String mobileNumber,
        String message,
        boolean mobileVerified
) {
}
package com.krishsolutions.vdbp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record SignupRequest(@NotBlank(message = "Full name is required")
                             @Size(max = 100, message = "Full name must not exceed 100 characters")
                             String fullName,

                            @NotBlank(message = "Mobile number is required")
                             @Pattern(
                                     regexp = "^[6-9][0-9]{9}$",
                                     message = "Enter a valid 10-digit Indian mobile number"
                             )
                             String mobileNumber,

                            @NotBlank(message = "Password is required")
                             @Size(min = 8, max = 72,
                                     message = "Password must contain 8 to 72 characters")
                             String password

) {
}
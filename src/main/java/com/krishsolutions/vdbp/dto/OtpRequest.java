package com.krishsolutions.vdbp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class OtpRequest {
    @NotBlank (message = "Mobile number is required")
    @Pattern(
            regexp = "^[6-9][0-9]{9}$",
            message = "Enter a valid 10-digit Indian mobile number"
    )
    private String mobileNumber;


    public OtpRequest() {
    }

    public OtpRequest(String mobileNumber) {
        this.mobileNumber = mobileNumber;

    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


}
package com.krishsolutions.vdbp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class OtpVerifyRequest {
    @NotBlank
    @Pattern(regexp = "^[6-9][0-9]{9}$")
   private String mobileNumber;

    @NotBlank
    @Pattern(regexp = "^[0-9]{6}$")
    private String otp;

    public OtpVerifyRequest(String mobileNumber, String otp) {
        this.mobileNumber = mobileNumber;
        this.otp = otp;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}

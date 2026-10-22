package com.krishsolutions.vdbp.dto;


import com.krishsolutions.vdbp.service.EmailOtpService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/otp")
public class OtpAuthController {

    private final EmailOtpService emailOtpService;

    public OtpAuthController(EmailOtpService emailOtpService) {
        this.emailOtpService = emailOtpService;
    }
    @PostMapping("/request")
    public ResponseEntity<String> requestOtp(
            @Valid @RequestBody OtpRequest request) {

       // otpAuthService.requestOtp(request.mobileNumber());

        return ResponseEntity.ok(
                "If the account is eligible, an OTP will be sent."
        );
    }

    @PostMapping("/verify")
    public ResponseEntity<AuthResponse> verifyOtp(
            @Valid @RequestBody OtpVerifyRequest request) {

//        AuthResponse response = otpAuthService.verifyOtp(
//                request.mobileNumber(),
//                request.otp()
//        );

//        return ResponseEntity.ok(response);
//
        return null;
    }


}

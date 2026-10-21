package com.krishsolutions.vdbp.service;


import com.krishsolutions.vdbp.dto.SignupRequest;
import com.krishsolutions.vdbp.dto.SignupResponse;
import com.krishsolutions.vdbp.entity.AuthUser;
import com.krishsolutions.vdbp.repository.AuthUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {

    private final AuthUserRepository authUserRepository;

    private final PasswordEncoder passwordEncoder;


    public AuthService(AuthUserRepository authUserRepository, PasswordEncoder passwordEncoder) {
        this.authUserRepository = authUserRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @Transactional
    public SignupResponse register(SignupRequest request) {

        String mobileNumber = request.mobileNumber().trim();

        if (authUserRepository.existsByMobileNumber(mobileNumber)) {
            throw new IllegalArgumentException(
                    "Mobile number is already registered"
            );
        }

        String encodedPassword =
                passwordEncoder.encode(request.password());

        AuthUser user = new AuthUser(
                request.fullName().trim(),
                mobileNumber,
                encodedPassword
        );

        AuthUser savedUser = authUserRepository.save(user);

        return new SignupResponse(
                savedUser.getId(),
                savedUser.getFullName(),
                savedUser.getMobileNumber(),
                "Registration successful. Please verify your mobile number.",
                savedUser.isMobileVerified()
        );
    }



}



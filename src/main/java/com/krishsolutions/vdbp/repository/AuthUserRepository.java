package com.krishsolutions.vdbp.repository;

import com.krishsolutions.vdbp.entity.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {

    boolean existsByMobileNumber(String mobileNumber);






}

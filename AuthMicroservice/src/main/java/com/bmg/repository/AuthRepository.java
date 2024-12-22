package com.bmg.repository;

import com.bmg.dto.LoginResponseDto;
import com.bmg.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Auth,Long> {

    Boolean existsByUsernameAndPassword(String username, String password);
}

package com.bmg.service;

import com.bmg.dto.CreateUserRequestDto;
import com.bmg.dto.LoginResponseDto;
import com.bmg.dto.RegisterRequestDto;
import com.bmg.entity.Auth;
import com.bmg.manager.UserProfileManager;
import com.bmg.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthRepository repository;
    private final UserProfileManager manager;

    public Auth register(RegisterRequestDto dto){

        Auth auth = Auth.builder()
                .username(dto.getUsername())
                .password(dto.getPassword())
                .email(dto.getEmail())
                .build();
        this.repository.save(auth);

        this.manager.createUser(CreateUserRequestDto.builder()
                        .authId(auth.getId())
                        .email(auth.getEmail())
                        .username(auth.getUsername())
                .build());
        return auth;
    }

    public Boolean login(LoginResponseDto dto){

        return this.repository.existsByUsernameAndPassword(dto.getUsername(), dto.getPassword());
        
    }
}

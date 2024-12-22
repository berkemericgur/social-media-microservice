package com.bmg.controller;

import com.bmg.dto.LoginResponseDto;
import com.bmg.dto.RegisterRequestDto;
import com.bmg.entity.Auth;
import com.bmg.service.AuthService;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.bmg.config.RestApis.*;

@RestController
@RequestMapping(AUTHSERVICE)
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping(REGISTER)
    public ResponseEntity<Auth> register(@RequestBody RegisterRequestDto dto){

        if (!dto.getPassword().equals(dto.getRepassword()))
            throw new RuntimeException("Şifreler birbiriyle uyuşmuyor");

        Auth auth = this.service.register(dto);
        return ResponseEntity.ok(auth);
    }

    @PostMapping(LOGIN)
    public ResponseEntity<Boolean> login(@RequestBody LoginResponseDto dto){

        return ResponseEntity.ok(this.service.login(dto));
    }

}

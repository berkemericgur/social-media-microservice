package com.bmg.controller;

import com.bmg.document.UserProfile;
import com.bmg.dto.request.CreateUserRequestDto;
import com.bmg.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.bmg.config.RestApis.*;

import java.util.List;

@RestController
@RequestMapping(USERPROFILE)
@RequiredArgsConstructor
public class UserProfileController {

    private final UserProfileService service;

    @PostMapping(CREATEUSER)
    public ResponseEntity<Boolean> createUser(@RequestBody CreateUserRequestDto dto){

        this.service.createUser(dto);
        return ResponseEntity.ok(true);
    }

    @GetMapping(GETALL)
    public ResponseEntity<List<UserProfile>> getAll(){

        return ResponseEntity.ok(this.service.getAll());
    }

    @GetMapping("/upper-name")
    public ResponseEntity<String> upperName(String name){

        return ResponseEntity.ok(this.service.upperName(name));
    }


}

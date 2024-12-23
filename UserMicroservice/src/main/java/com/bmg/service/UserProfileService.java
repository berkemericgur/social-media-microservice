package com.bmg.service;

import com.bmg.document.UserProfile;
import com.bmg.dto.request.CreateUserRequestDto;
import com.bmg.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserProfileService {

    private final UserProfileRepository repository;
    private final CacheManager cacheManager;

    public void createUser(CreateUserRequestDto dto){

        this.repository.save(UserProfile.builder()
                        .authId(dto.getAuthId())
                        .username(dto.getUsername())
                        .email(dto.getEmail())
                .build());
    }

    public List<UserProfile> getAll(){

        return this.repository.findAll();
    }

    @Cacheable("upper-case")
    public String upperName(String name) {

        try {
            Thread.sleep(3000);
        }catch (Exception e) {}

        return name.toUpperCase();
    }

    public void cacheClear(){

        this.cacheManager.getCache("upper-case").clear();
    }
}

package com.bmg.manager;

import com.bmg.dto.CreateUserRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.bmg.config.RestApis.CREATEUSER;

@FeignClient(url = "http://localhost:9091/dev/v1/user-profile", name = "userProfileManager")
public interface UserProfileManager {

    @PostMapping(CREATEUSER)
    ResponseEntity<Boolean> createUser(@RequestBody CreateUserRequestDto dto);

}

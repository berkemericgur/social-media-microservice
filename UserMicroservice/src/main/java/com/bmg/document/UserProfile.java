package com.bmg.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserProfile {
    @Id
    String id;
    Long authId;
    String username;
    String name;
    String surname;
    String email;
    String phone;
    String avatar;
    String insta;
    String twitter;
    Boolean isActive;
    Long createAt;

}
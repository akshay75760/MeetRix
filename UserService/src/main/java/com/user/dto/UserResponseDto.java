package com.user.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {
    private String id;
    private String name;
    private String email;
    private String role;
    private String location;
    private String phone;
    private String timezone;
    private String productivityGoal;
}

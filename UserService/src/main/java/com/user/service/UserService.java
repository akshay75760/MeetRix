package com.user.service;

import com.user.dto.UserResponseDto;
import com.user.enteties.User;

public interface UserService {
    public void RegisterUser(User user);
    public UserResponseDto GetUserByEmail(String email);

    public void UpdateUser(String email, User user);
    public void DeleteUser(String email);
    public UserResponseDto login(String email, String password);
}

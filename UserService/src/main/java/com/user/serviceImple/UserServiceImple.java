package com.user.serviceImple;

import java.util.UUID;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.user.dto.UserResponseDto;
import com.user.enteties.User;
import com.user.repo.UserRepo;
import com.user.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImple implements UserService {

    private final UserRepo userRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public void RegisterUser(User user) {
        Long userId = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
        user.setId(userId);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public UserResponseDto GetUserByEmail(String email) {
        User user = userRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("User not found"));
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(String.valueOf(user.getId()));
        userResponseDto.setName(user.getName());
        userResponseDto.setEmail(user.getEmail());
        userResponseDto.setRole(user.getRole().name());
        userResponseDto.setLocation(user.getLocation());
        userResponseDto.setPhone(user.getPhone());
        userResponseDto.setTimezone(user.getTimezone());
        userResponseDto.setProductivityGoal(user.getProductivityGoal());
        return userResponseDto;
    }

    @Override
    public void UpdateUser(String email, User user) {
        User existingUser = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));

        existingUser.setName(user.getName());
        existingUser.setProductivityGoal(user.getProductivityGoal());
        existingUser.setTimezone(user.getTimezone());
        existingUser.setLocation(user.getLocation());
        existingUser.setPhone(user.getPhone()); 
        // Update other fields as necessary

        userRepository.save(existingUser);
    }

    @Override
    public void DeleteUser(String email) {
        User foundUser = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));
        userRepository.delete(foundUser);
    }

    @Override
    public UserResponseDto login(String email, String password) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Invalid password");
        }
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(String.valueOf(user.getId()));
        userResponseDto.setName(user.getName());
        userResponseDto.setEmail(user.getEmail());
        userResponseDto.setRole(user.getRole().name());
        userResponseDto.setLocation(user.getLocation());
        userResponseDto.setPhone(user.getPhone());
        userResponseDto.setTimezone(user.getTimezone());
        userResponseDto.setProductivityGoal(user.getProductivityGoal());
        return userResponseDto;
    }


}

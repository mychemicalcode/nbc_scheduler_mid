package com.study.scheduler.service;


import com.study.scheduler.dto.SignUpResponseDto;
import com.study.scheduler.entity.User;
import com.study.scheduler.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public SignUpResponseDto signUp(String username, String email) {

        User user = new User(username, email);

        User savedUser = userRepository.save(user);

        return new SignUpResponseDto(savedUser.getId(), savedUser.getUsername(), savedUser.getEmail());
    }
}

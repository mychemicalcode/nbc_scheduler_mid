package com.study.scheduler.service;


import com.study.scheduler.dto.SignUpResponseDto;
import com.study.scheduler.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;


    public SignUpResponseDto signUp(String username, String email) {

        return null;
    }
}

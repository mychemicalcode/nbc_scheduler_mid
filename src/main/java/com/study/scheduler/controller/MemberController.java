package com.study.scheduler.controller;

import com.study.scheduler.dto.SignUpRequestDto;
import com.study.scheduler.dto.SignUpResponseDto;
import com.study.scheduler.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class MemberController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<SignUpRequestDto> sighUp(@RequestBody SignUpRequestDto requestDto) {

        SignUpResponseDto signUpResponseDto = userService.signUp(requestDto.getUsername(), requestDto.getEmail())

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

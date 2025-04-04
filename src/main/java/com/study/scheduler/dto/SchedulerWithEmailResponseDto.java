package com.study.scheduler.dto;


import lombok.Getter;

@Getter
public class SchedulerWithEmailResponseDto {

    private final String title;

    private final String contents;

    private final String email;

    public SchedulerWithEmailResponseDto(String title, String contents, String email) {
        this.title = title;
        this.contents = contents;
        this.email = email;

    }
}

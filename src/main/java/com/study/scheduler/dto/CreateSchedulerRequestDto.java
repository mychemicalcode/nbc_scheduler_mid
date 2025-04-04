package com.study.scheduler.dto;


import lombok.Getter;

@Getter
public class CreateSchedulerRequestDto {

    private final String title;

    private final String contents;

    private final String username;

    public CreateSchedulerRequestDto(String title, String contents, String username) {
        this.title = title;
        this.contents = contents;
        this.username = username;

    }
}

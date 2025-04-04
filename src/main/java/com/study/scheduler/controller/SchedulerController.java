package com.study.scheduler.controller;


import com.study.scheduler.dto.CreateSchedulerRequestDto;
import com.study.scheduler.dto.SchedulerResponseDto;
import com.study.scheduler.dto.SchedulerWithEmailResponseDto;
import com.study.scheduler.entity.Scheduler;
import com.study.scheduler.service.SchedulerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedulers")
public class SchedulerController {

    private final SchedulerService schedulerService;

    @PostMapping
    public ResponseEntity<SchedulerResponseDto> save(@RequestBody CreateSchedulerRequestDto requestDto) {

        SchedulerResponseDto schedulerResponseDto = schedulerService.save(
                requestDto.getTitle(),
                requestDto.getContents(),
                requestDto.getUsername());

        return new ResponseEntity<>(schedulerResponseDto, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<SchedulerResponseDto>> findAll() {

        List<SchedulerResponseDto> schedulerResponseDtoList = schedulerService.findAll();

        return new ResponseEntity<>(schedulerResponseDtoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SchedulerWithEmailResponseDto> findById(@PathVariable Long id) {

        SchedulerWithEmailResponseDto schedulerWithEmailResponseDto = schedulerService.findById(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        schedulerService.delete(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}

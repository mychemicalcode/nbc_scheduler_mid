package com.study.scheduler.service;


import com.study.scheduler.dto.SchedulerResponseDto;
import com.study.scheduler.dto.SchedulerWithEmailResponseDto;
import com.study.scheduler.entity.Scheduler;
import com.study.scheduler.entity.User;
import com.study.scheduler.repository.SchedulerRepository;
import com.study.scheduler.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchedulerService {

    private final UserRepository userRepository;
    private final SchedulerRepository schedulerRepository;

    public SchedulerResponseDto save(String title, String contents, String username) {

        User findUser = userRepository.findUserByUsernameOrElseThrow(username);

        Scheduler scheduler = new Scheduler(title, contents);

        scheduler.setUser(findUser);

        Scheduler savedScheduler = schedulerRepository.save(scheduler);

        return new SchedulerResponseDto(savedScheduler.getId(), savedScheduler.getTitle(), savedScheduler.getContents());
    }

    public List<SchedulerResponseDto> findAll(){

        return schedulerRepository.findAll().stream().map(SchedulerResponseDto::toDto).toList();

    }

    public SchedulerWithEmailResponseDto findById(Long id) {

        Scheduler findScheduler = schedulerRepository.findByIdOrElseThrow(id);
        User writer = findScheduler.getUser();

        return new SchedulerWithEmailResponseDto(findScheduler.getTitle(), findScheduler.getContents(), writer.getEmail());
    }

    public void delete(Long id) {

        Scheduler findScheduler = schedulerRepository.findByIdOrElseThrow(id);

        schedulerRepository.delete(findScheduler);

    }
}

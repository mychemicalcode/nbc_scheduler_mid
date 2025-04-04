package com.study.scheduler.repository;

import com.study.scheduler.entity.Scheduler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public interface SchedulerRepository extends JpaRepository<Scheduler, Long> {

    default Scheduler findByIdOrElseThrow(Long id) {
        return findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Does not exist id= " + id));
    }
}

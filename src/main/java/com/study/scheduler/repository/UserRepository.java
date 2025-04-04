package com.study.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User ,Long> {
// Spring Data JPA를 사용하므로 Interface 사용
}

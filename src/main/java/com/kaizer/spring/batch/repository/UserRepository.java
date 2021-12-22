package com.kaizer.spring.batch.repository;

import com.kaizer.spring.batch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.model.UserInput;

public interface UserInputRepository extends JpaRepository<UserInput, Long> {
}

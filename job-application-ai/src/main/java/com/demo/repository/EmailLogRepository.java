package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.model.EmailLog;

public interface EmailLogRepository extends JpaRepository<EmailLog, Long> {
}

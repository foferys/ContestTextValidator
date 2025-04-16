package com.example.contesttextanalyzer.repository;

import com.example.contesttextanalyzer.model.TextSubmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextSubmissionRepository extends JpaRepository<TextSubmission, Long> {
} 
package com.example.contesttextanalyzer.service;

import com.example.contesttextanalyzer.model.TextSubmission;
import com.example.contesttextanalyzer.repository.TextSubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
public class TextAnalysisService {

    @Autowired
    private TextSubmissionRepository repository;

    public TextSubmission analyzeText(MultipartFile file) throws IOException {
        String content = new String(file.getBytes(), StandardCharsets.UTF_8);
        String result = performAnalysis(content);

        TextSubmission submission = new TextSubmission();
        submission.setFileName(file.getOriginalFilename());
        submission.setContent(content);
        submission.setAnalysisResult(result);

        return repository.save(submission);
    }

    private String performAnalysis(String content) {
        // Per ora implementiamo una logica semplice di analisi
        // Possiamo migliorarla in seguito
        if (content.toLowerCase().contains("innovazione") || 
            content.toLowerCase().contains("tecnologia") || 
            content.toLowerCase().contains("coding") || 
            content.toLowerCase().contains("sviluppo")) {
            return "POSITIVO";
        }
        return "NEGATIVO";
    }
} 
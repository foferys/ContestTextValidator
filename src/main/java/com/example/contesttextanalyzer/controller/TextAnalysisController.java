package com.example.contesttextanalyzer.controller;

import com.example.contesttextanalyzer.model.TextSubmission;
import com.example.contesttextanalyzer.service.TextAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TextAnalysisController {

    @Autowired
    private TextAnalysisService textAnalysisService;

    @PostMapping("/analyze")
    public ResponseEntity<?> analyzeText(@RequestParam("file") MultipartFile file) {
        Map<String, String> response = new HashMap<>();
        
        try {
            if (file.isEmpty()) {
                response.put("error", "Il file è vuoto");
                return ResponseEntity.badRequest().body(response);
            }

            if (!file.getContentType().equals("text/plain")) {
                response.put("error", "Sono accettati solo file di testo (.txt)");
                return ResponseEntity.badRequest().body(response);
            }

            TextSubmission result = textAnalysisService.analyzeText(file);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            response.put("error", "Errore durante l'analisi del testo: " + e.getMessage());
            return ResponseEntity.internalServerError().body(response);
        }
    }
} 
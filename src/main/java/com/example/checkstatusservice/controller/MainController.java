package com.example.checkstatusservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/status")
public class MainController {

    @PostMapping("/{id}")
    public ResponseEntity<Map<String, String>> checkStatus() {
        return null;
    }
}

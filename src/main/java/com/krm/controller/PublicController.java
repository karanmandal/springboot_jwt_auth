package com.krm.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/public")
public class PublicController {

    @GetMapping
    public ResponseEntity getMessage() {
        return ResponseEntity.ok("Hello from public API controller");
    }
}
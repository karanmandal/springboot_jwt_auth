package com.krm.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/private")
public class PrivateController {

    @GetMapping
    public ResponseEntity getMessage() {
        return ResponseEntity.ok("Hello from private API controller");
    }
}
package com.bata.devopsprojapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/validation")
public class ValidationController {

    @GetMapping("/validate")
    public ResponseEntity<String> validadeStatus(){
        return ResponseEntity.ok("The DevopsProj Application is running...");
    }

}

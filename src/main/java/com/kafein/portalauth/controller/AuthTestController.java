package com.kafein.portalauth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthTestController {

    @GetMapping("/check")
    @PreAuthorize("hasRole('user')")
    public ResponseEntity<String> checkToken() {
        return ResponseEntity.ok("Token geçerli ve yetki mevcut.");
    }
}

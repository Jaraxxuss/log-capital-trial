package com.log.capital.trial_server;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/api/auth/me")
    public String checkAuth(Principal principal) {
        return principal.getName(); 
    }
}
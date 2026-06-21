package com.rico.lms.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
public class AuthController {
    @GetMapping("/test")
    public String testAuth(){
        return "Auth Api is working budd";
    }
}

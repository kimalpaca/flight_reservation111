package com.example.flight_reservation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignupController {

    @GetMapping("/signup")
    public String signupPage() {
        return "signup"; // templates/signup.html 반환
    }
}


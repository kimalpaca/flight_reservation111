package com.example.flight_reservation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ResultController {

    @GetMapping("/result")
    public String showResultPage() {
        // result.html 파일을 반환
        return "result";
    }
}

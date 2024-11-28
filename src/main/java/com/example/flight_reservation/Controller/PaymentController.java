package com.example.flight_reservation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {

    @GetMapping("/payment")
    public String showPaymentPage() {
        // payment.html 파일을 반환
        return "payment";
    }
}


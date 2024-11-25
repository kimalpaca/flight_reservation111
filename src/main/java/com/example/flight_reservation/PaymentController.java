package com.example.flight_reservation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {

    @GetMapping("/payment-confirmation")
    public String paymentConfirmation() {
        return "payment_confirmation"; // payment_confirmation.html 렌더링
    }
}

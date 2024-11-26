package com.example.flight_reservation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReservationController {

    @GetMapping("/reservation")
    public String reservationPage() {
        return "reservation"; // reservation.html 렌더링
    }
}

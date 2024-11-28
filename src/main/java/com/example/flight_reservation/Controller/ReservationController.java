package com.example.flight_reservation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ReservationController {

    @GetMapping("/reservation")
    public String reservationPage() {
        return "reservation"; // reservation.html 렌더링
    }

    @PostMapping("/reservation/reserve")
    public String reservePage(
            @RequestParam("adultCount") int adultCount,
            @RequestParam("teenCount") int teenCount,
            @RequestParam("childCount") int childCount,
            Model model) {
        model.addAttribute("adultCount", adultCount);
        model.addAttribute("teenCount", teenCount);
        model.addAttribute("childCount", childCount);
        return "info";
    }
}



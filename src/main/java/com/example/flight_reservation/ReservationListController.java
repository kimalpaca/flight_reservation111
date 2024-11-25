package com.example.flight_reservation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservationListController {

    @GetMapping("/reservation-list")
    public String showReservationList() {
        return "reservation_list"; // templates/reservation_list.html 파일 반환
    }

}




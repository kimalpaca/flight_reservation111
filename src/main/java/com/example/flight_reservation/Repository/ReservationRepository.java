package com.example.flight_reservation.Repository;

import com.example.flight_reservation.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}

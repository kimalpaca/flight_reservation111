package com.example.flight_reservation.Repository;

import com.example.flight_reservation.Entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
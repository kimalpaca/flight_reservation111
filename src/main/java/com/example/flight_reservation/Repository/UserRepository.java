package com.example.flight_reservation.Repository;

import com.example.flight_reservation.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

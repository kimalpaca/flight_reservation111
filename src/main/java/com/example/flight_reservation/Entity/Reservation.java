package com.example.flight_reservation.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import lombok.Data;
import java.sql.Date;

@Entity
@Table(name = "reservations")
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id") // 데이터베이스와 일치
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)  // users 테이블의 user_id와 매핑
    private User user;

    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)  // flights 테이블의 flight_id와 매핑
    private Flight flight;

    @Column(name = "reservation_date", nullable = false)
    private Date reservationDate;

    @Column(name = "total_price", nullable = false)
    private Double totalPrice;
}

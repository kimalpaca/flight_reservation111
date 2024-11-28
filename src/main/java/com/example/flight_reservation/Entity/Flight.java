package com.example.flight_reservation.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "flights")
@Data
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id", nullable = false, unique = true) // ID 컬럼 설정
    private Long flightId; // 데이터베이스 bigint와 매칭 (int → Long 변경)

    @Column(name = "departure_airport", nullable = false, length = 50) // 길이 설정
    private String departureAirport;

    @Column(name = "arrival_airport", nullable = false, length = 50) // 길이 설정
    private String arrivalAirport;

    @Column(name = "departure_time", nullable = false, length = 255) // 길이 설정
    private String departureTime;

    @Column(name = "arrival_time", nullable = false, length = 255) // 길이 설정
    private String arrivalTime;

    @Column(name = "class_type", nullable = false, length = 255) // 길이 설정
    private String classType;

    @Column(name = "price", nullable = false)
    private Double price; // double → Double로 변경 (Wrapper 클래스 사용)

}

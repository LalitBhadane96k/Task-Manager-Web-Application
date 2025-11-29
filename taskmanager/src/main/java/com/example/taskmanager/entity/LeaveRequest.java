package com.example.taskmanager.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class LeaveRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User employee;

    private LocalDate startDate;
    private LocalDate endDate;
    private String status; // PENDING, APPROVED, REJECTED
}

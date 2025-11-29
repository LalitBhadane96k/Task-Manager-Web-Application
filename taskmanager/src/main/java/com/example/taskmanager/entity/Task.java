package com.example.taskmanager.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String status; // PENDING, IN_PROGRESS, COMPLETE

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assignedTo;
}

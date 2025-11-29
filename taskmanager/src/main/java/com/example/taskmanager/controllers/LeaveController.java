package com.example.taskmanager.controllers;

import com.example.taskmanager.entity.LeaveRequest;
import com.example.taskmanager.repository.LeaveRequestRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaves")
@CrossOrigin
public class LeaveController {
    private final LeaveRequestRepository leaveRepository;
    public LeaveController(LeaveRequestRepository leaveRepository) { this.leaveRepository = leaveRepository; }

    @GetMapping
    public List<LeaveRequest> getAllLeaves() { return leaveRepository.findAll(); }

    @PostMapping
    public LeaveRequest requestLeave(@RequestBody LeaveRequest leave) {
        leave.setStatus("PENDING");
        return leaveRepository.save(leave);
    }

    @PutMapping("/{id}")
    public LeaveRequest updateLeaveStatus(@PathVariable Long id, @RequestBody LeaveRequest data) {
        LeaveRequest leave = leaveRepository.findById(id).orElseThrow();
        leave.setStatus(data.getStatus());
        return leaveRepository.save(leave);
    }
}

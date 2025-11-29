package com.example.taskmanager.controllers;

import com.example.taskmanager.entity.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin
public class TaskController {
    private final TaskRepository taskRepository;
    public TaskController(TaskRepository taskRepository) { this.taskRepository = taskRepository; }

    @GetMapping
    public List<Task> getAllTasks() { return taskRepository.findAll(); }

    @PostMapping
    public Task createTask(@RequestBody Task task) { return taskRepository.save(task); }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task taskData) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setTitle(taskData.getTitle());
        task.setDescription(taskData.getDescription());
        task.setStatus(taskData.getStatus());
        return taskRepository.save(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) { taskRepository.deleteById(id); }
}

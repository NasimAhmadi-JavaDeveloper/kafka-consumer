package com.example.consumer.repository;

import com.example.consumer.model.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepo extends JpaRepository<Tasks, Integer> {
}
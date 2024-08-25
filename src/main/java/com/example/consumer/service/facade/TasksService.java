package com.example.consumer.service.facade;

import com.example.consumer.model.dto.TasksDto;
import com.example.consumer.model.entity.Employee;

import java.util.List;

public interface TasksService {
    void save(Employee employee, List<TasksDto> tasksDto);
}
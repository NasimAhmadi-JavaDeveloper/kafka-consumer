package com.example.consumer.service.impl;

import com.example.consumer.mapper.TasksMapper;
import com.example.consumer.model.dto.TasksDto;
import com.example.consumer.model.entity.Employee;
import com.example.consumer.model.entity.Tasks;
import com.example.consumer.repository.TasksRepo;
import com.example.consumer.service.facade.TasksService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TasksServiceImpl implements TasksService {

    private final TasksRepo tasksRepo;
    private final TasksMapper tasksMapper;

    @Override
    public void save(Employee savedEmployee, List<TasksDto> tasksDto) {
        List<Tasks> taskEntityList = tasksMapper.mapToTask(tasksDto);

        for (Tasks entity : taskEntityList) {
            entity.setEmployee(savedEmployee);
            tasksRepo.save(entity);
        }
    }
}
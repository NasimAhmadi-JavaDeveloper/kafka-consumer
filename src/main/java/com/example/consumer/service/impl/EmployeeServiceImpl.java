package com.example.consumer.service.impl;

import com.example.consumer.mapper.EmployeeMapper;
import com.example.consumer.model.dto.RootDto;
import com.example.consumer.model.dto.TasksDto;
import com.example.consumer.model.entity.Employee;
import com.example.consumer.repository.EmployeeRepo;
import com.example.consumer.service.facade.EmployeeService;
import com.example.consumer.service.facade.TasksService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo employeeRepo;
    private final TasksService tasksService;
    private final EmployeeMapper employeeMapper;

    @Override
    public void save(RootDto rootDto) {
        Employee savedEmployee = employeeRepo.save(employeeMapper.mapToEmployee(rootDto.getEmployee()));
        List<TasksDto> tasksDto = rootDto.getTasks();
        tasksService.save(savedEmployee, tasksDto);
    }
}
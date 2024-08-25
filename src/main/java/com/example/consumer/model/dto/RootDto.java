package com.example.consumer.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class RootDto {
    public EmployeeDto employee;
    public List<TasksDto> tasks;
}
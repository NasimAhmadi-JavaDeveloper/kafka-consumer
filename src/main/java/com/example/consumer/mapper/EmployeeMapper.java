package com.example.consumer.mapper;

import com.example.consumer.model.dto.EmployeeDto;
import com.example.consumer.model.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee mapToEmployee(EmployeeDto dto);
}

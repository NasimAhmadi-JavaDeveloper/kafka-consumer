package com.example.consumer.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class EmployeeDto {
    private BigDecimal id;
    private String name;
    private String department;
    private String position;
    private BigDecimal salary;
    private String hireDate;
}

package com.example.consumer.model.dto;

import com.example.consumer.enumeration.TaskStatusEnum;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
public class TasksDto {
    private BigDecimal id;
    private String description;
    private TaskStatusEnum status;
    private Date dueDate;
}
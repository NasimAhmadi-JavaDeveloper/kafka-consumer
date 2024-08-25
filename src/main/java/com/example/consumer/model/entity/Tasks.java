package com.example.consumer.model.entity;

import com.example.consumer.enumeration.TaskStatusEnum;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Table
@Setter
@Getter
@Entity
@EqualsAndHashCode(of = "description")
public class Tasks {

    @Id
    @GeneratedValue
    private BigDecimal id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column
    private String description;

    @Column
    @Enumerated(EnumType.STRING)
    private TaskStatusEnum status;

    @Column
    private Date dueDate;
}
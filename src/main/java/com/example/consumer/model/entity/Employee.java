package com.example.consumer.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Setter
@Getter
@EqualsAndHashCode(of = "name")
public class Employee {

    @Id
    @GeneratedValue
    private BigDecimal id;

    @Column
    private String name;

    @Column
    private String department;

    @Column
    private String position;

    @Column
    private BigDecimal salary;

    @Column
    private Date hireData;

    @OneToMany(mappedBy = "employee")
    private List<Tasks> tasks;
}


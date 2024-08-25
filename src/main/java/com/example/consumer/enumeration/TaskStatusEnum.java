package com.example.consumer.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskStatusEnum {
    IN_PROGRESS,
    COMPLETED,
    PENDING
}

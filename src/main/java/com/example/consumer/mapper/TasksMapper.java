package com.example.consumer.mapper;

import com.example.consumer.model.dto.TasksDto;
import com.example.consumer.model.entity.Tasks;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TasksMapper {
    List<Tasks> mapToTask(List<TasksDto> tasks);
    Tasks map(TasksDto value);
}
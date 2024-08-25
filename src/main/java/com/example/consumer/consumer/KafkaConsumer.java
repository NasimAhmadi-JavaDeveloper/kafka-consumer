package com.example.consumer.consumer;

import com.example.consumer.model.dto.RootDto;
import com.example.consumer.service.facade.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
//import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaConsumer {

    private final ObjectMapper mapper;
    private final EmployeeService employeeService;

//    @KafkaListener(topics = "topic-1", groupId = "your-consumer-group-id")
//    public void consumeMessage(String message) throws JsonProcessingException {
//        log.info("Received message: {}", message);
//        employeeService.save(mapper.readValue(message, RootDto.class));
//    }
}
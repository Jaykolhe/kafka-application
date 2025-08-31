package com.jay.kafka_project.controller;

import com.jay.kafka_project.payload.Student;
import com.jay.kafka_project.producer.KafkaJsonProducer;
import com.jay.kafka_project.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {

    //private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaProducer;

//    @PostMapping
//    public ResponseEntity<String>  sendMessage(@RequestBody String message
//    ){
//        kafkaProducer.publishMessage(message);
//        return ResponseEntity.ok("Message Queued Successfully");
//    }


    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody Student student){

        kafkaProducer.publishJsonMessage(student);
        return ResponseEntity.ok("Message Queued Successfully");
    }
}

package com.jay.kafka_project.consumer;

import com.jay.kafka_project.payload.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "JK",groupId = "myGroup")
    public void consumeMessage(Student student){
        log.info(format("Consuming Messages from JK Topic:: %s", student.toString()));
    }


}

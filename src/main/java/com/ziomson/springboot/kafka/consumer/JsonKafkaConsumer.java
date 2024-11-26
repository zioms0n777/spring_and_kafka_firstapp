package com.ziomson.springboot.kafka.consumer;


import com.ziomson.springboot.kafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER   = LoggerFactory.getLogger(JsonKafkaConsumer.class);


    @KafkaListener(topics = "ziomson_json", groupId = "myGroup")
    public void consume(User user)
    {
        LOGGER.info(String.format("Json message: %s", user.toString()));
    }
}

package com.ziomson.springboot.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("ziomson")
    private String topicName;


    @Value("ziomson_json")
    private String topicJsonName;


    @Bean
    public NewTopic ziomsonTopic()
    {
        return TopicBuilder.name(topicName).build();
    }

    @Bean
public NewTopic ziomsonJsonTopic()
{
    return TopicBuilder.name(topicJsonName).build();
}

}

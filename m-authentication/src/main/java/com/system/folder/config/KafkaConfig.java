package com.system.folder.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic userRegisterTopic() {
        return TopicBuilder.name("t-user-register").partitions(1).replicas(1).build();
    }

    @Bean
    public NewTopic userLoginTopic() {
        return TopicBuilder.name("t-user-login").partitions(1).replicas(1).build();
    }


}

package com.system.folder.broker.producer;

import com.system.folder.broker.message.UserLoginMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserLoginProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserLoginProducer.class);

    @Autowired
    private KafkaTemplate<String,UserLoginMessage> kafkaTemplate;

    public void publish(UserLoginMessage userLoginMessage) {
        kafkaTemplate.send("t-user-login",userLoginMessage);
    }
}

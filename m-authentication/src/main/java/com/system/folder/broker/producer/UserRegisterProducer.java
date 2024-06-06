package com.system.folder.broker.producer;

import com.system.folder.broker.message.UserLoginMessage;
import com.system.folder.broker.message.UserRegisterMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRegisterProducer.class);

    @Autowired
    private KafkaTemplate<String,UserRegisterMessage> kafkaTemplate;

    public void publish(UserRegisterMessage userRegisterMessage) {
        kafkaTemplate.send("t-user-user",userRegisterMessage);
    }
}

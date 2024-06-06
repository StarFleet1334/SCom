package com.system.folder.broker.producer;


import com.system.folder.broker.message.UserCommonMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserActionProducer {

    @Autowired
    private KafkaTemplate<String,UserCommonMessage> userCommonMessageKafkaTemplate;

    public void publish(UserCommonMessage userCommonMessage) {
        userCommonMessageKafkaTemplate.send("t-user",userCommonMessage);
    }

}

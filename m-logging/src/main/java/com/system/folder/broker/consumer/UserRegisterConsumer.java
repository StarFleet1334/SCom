package com.system.folder.broker.consumer;


import com.system.folder.broker.message.UserRegisterMessage;
import com.system.folder.broker.producer.UserActionProducer;
import com.system.folder.util.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterConsumer {


    @Autowired
    private UserActionProducer userActionProducer;

    @KafkaListener(topics = "t-user-register")
    public void consumer(UserRegisterMessage userRegisterMessage) {
        userActionProducer.publish(Transformer.transform(userRegisterMessage));
    }


}

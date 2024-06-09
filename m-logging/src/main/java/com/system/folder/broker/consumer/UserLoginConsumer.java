package com.system.folder.broker.consumer;


import com.system.folder.broker.message.UserLoginMessage;
import com.system.folder.broker.producer.UserActionProducer;
import com.system.folder.util.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserLoginConsumer {

    @Autowired
    private UserActionProducer userActionProducer;


    @KafkaListener(topics = "t-user-login",containerFactory = "globalLogContainerFactory")
    public void consumer(UserLoginMessage userLoginMessage) {
        userActionProducer.publish(Transformer.transform(userLoginMessage));
    }



}

package com.dbs.jms;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.dbs.jms.dto.OrderStatus;

@Component
public class JMSConsumer {
    @RabbitListener(queues = "dbs_queue")
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message recieved from queue : " + orderStatus);
    }
    
}
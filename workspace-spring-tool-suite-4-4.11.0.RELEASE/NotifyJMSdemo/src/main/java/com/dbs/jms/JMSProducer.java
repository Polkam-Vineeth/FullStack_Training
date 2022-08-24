package com.dbs.jms;

import java.util.UUID;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dbs.jms.config.JMSConfig;
import com.dbs.jms.dto.Order;
import com.dbs.jms.dto.OrderStatus;

@RestController
@RequestMapping("/order")
public class JMSProducer {
    
    @Autowired
    private RabbitTemplate template;
    @PostMapping("/{restaurantName}")
    public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName) {
        order.setOrderId(UUID.randomUUID().toString());
        //restaurant service
        //payment service
        OrderStatus orderStatus = new OrderStatus(order, "PROCESS", "order placed succesfully in " + restaurantName);
        template.convertAndSend(JMSConfig.EXCHANGE, JMSConfig.ROUTING_KEY, orderStatus);
        return "Success !!";
     }
}
            
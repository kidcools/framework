package com.kidcools.nfsbmpmq.config;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

public class RabbitConfig {
    @Bean("orderQueue")
    public Queue getQueue() {
        Queue q = new Queue("orderQueue", true);
        return q;
    }
}

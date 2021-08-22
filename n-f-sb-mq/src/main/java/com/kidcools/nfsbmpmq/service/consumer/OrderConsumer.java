package com.kidcools.nfsbmpmq.service.consumer;

import com.alibaba.fastjson.TypeReference;
import com.kldcools.common.util.R;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {
    @RabbitListener(queues="orderQueue")
    public void save(R msg, Channel channel, Message message)
    {
        System.out.println("消费者收到消息");
        System.out.println("msg"+msg.getData(new TypeReference<String>(){}));
        try {
            System.out.println("保存数据");
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.kidcools.nfsbmpmq.service.publisher;

import com.kldcools.common.util.R;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl {
    //RabbitAutoConfiguration中创建了AmpqTemplate实例
    @Autowired
    AmqpTemplate amqpTemplate;
    //saveOrder原来的数据库访问代码全部注释,添加rabbitmq消息发送代码
    public R saveOrder(String msg) {
        amqpTemplate.convertAndSend("orderQueue", R.ok("success").setData(msg));
        return R.ok("success").setData(msg);
    }
}

package com.kidcools.nfsbmpmq.controller;

import com.kidcools.nfsbmpmq.service.consumer.OrderConsumer;
import com.kidcools.nfsbmpmq.service.publisher.OrderServiceImpl;
import com.kldcools.common.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quene")
public class QueneController {
    @Autowired
    private OrderServiceImpl orderService;
    @RequestMapping("/send/{msg}")
    public R sendMsg(@PathVariable("msg") String msg){
        R res = orderService.saveOrder(msg);
        return res;
    }
}

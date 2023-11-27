package com.example.controller;


import com.example.model.Order;
import com.example.server.OrderProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderProducerService orderProducerService;

    @PostMapping
    public String orderController(@RequestBody Order order){

        orderProducerService.sendMessage(order);
        return "Successfully";
    }
}

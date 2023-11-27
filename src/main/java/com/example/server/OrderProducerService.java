package com.example.server;

import com.example.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderProducerService {
    public static final List<Order> ORDERS = new ArrayList<>();

    public void sendMessage(Order order) {
     ORDERS.add(order);
    }
}



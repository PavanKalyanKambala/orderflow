package com.pavan.orderflow.service;

import com.pavan.orderflow.dto.request.CreateOrderRequest;
import com.pavan.orderflow.dto.response.CreateOrderResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    public CreateOrderResponse createOrder(CreateOrderRequest request) {

        String orderId = UUID.randomUUID().toString();

        return new CreateOrderResponse(orderId, "CREATED");
    }
}
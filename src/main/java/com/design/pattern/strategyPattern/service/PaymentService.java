package com.design.pattern.strategyPattern.service;

import com.design.pattern.strategyPattern.service.strategy.PaymentStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentService {

    private final Map<String, PaymentStrategy> paymentStrategies;

    @Autowired
    public PaymentService(Map<String, PaymentStrategy> paymentStrategies) {
        this.paymentStrategies = paymentStrategies;
    }

    public void processPayment(String strategyName, double amount) {
        PaymentStrategy strategy = paymentStrategies.get(strategyName);
        if (strategy == null) {
            throw new IllegalArgumentException("Invalid payment strategy: " + strategyName);
        }
        strategy.pay(amount);
    }
}


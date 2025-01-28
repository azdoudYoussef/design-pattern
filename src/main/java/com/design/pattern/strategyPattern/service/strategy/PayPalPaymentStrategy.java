package com.design.pattern.strategyPattern.service.strategy;

import org.springframework.stereotype.Component;

@Component("paypalPaymentStrategy")
public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}



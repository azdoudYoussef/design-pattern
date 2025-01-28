package com.design.pattern.strategyPattern.service.strategy;

import org.springframework.stereotype.Component;

@Component("cardPaymentStrategy")
public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

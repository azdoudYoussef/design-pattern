package com.design.pattern.strategyPattern.controller;

import com.design.pattern.strategyPattern.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<String> makePayment(@RequestParam String strategy, @RequestParam double amount) {
        try {
            paymentService.processPayment(strategy, amount);
            return ResponseEntity.ok().body("Payment of " + amount + " processed using " + strategy + ".");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

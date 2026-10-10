package com.asan.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asan.producer.service.ProducerService;

@RestController
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("/send")
    public String sendMessage(@RequestParam(name = "message") String message) {
        producerService.sendMessage(message);
        return "Message sent: " + message;
    }
}

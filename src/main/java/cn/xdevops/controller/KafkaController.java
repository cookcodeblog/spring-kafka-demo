package cn.xdevops.controller;

import cn.xdevops.service.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaController {

    private final Producer producer;

    @PostMapping("/publish")
    public void sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
    }

}

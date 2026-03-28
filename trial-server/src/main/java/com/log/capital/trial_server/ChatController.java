package com.log.capital.trial_server;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ChatController {
    private final SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/send")
    public void processMessage(@Payload Message msg) {
        messagingTemplate.convertAndSendToUser(msg.recipient(), "/queue/messages", msg.content());
    }
}
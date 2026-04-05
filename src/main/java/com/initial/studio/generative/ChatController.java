package com.initial.studio.generative;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController; // This will now resolve via webflux starter

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatClient chatClient;

    // The Builder is auto-confi    gured by the Ollama starter
    public ChatController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping(value = "/stream", produces = "text/event-stream") // Better for React consumers
    public Flux<String> chat(@RequestParam String message) {
        return chatClient.prompt()
                .user(message) // Define the user input here
                .stream()
                .content();
    }
}
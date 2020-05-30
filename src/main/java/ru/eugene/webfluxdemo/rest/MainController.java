package ru.eugene.webfluxdemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.eugene.webfluxdemo.domain.Message;
import ru.eugene.webfluxdemo.service.MessageService;

@RestController
@RequestMapping("/")
public class MainController {
    private final MessageService messageService;

    @Autowired
    public MainController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public Flux<Message> getMessagesList() {
        return messageService.getAll();
    }

    @PostMapping
    public Mono<Message> addMessage(@RequestBody Message message) {
        return messageService.addOne(message);
    }
}

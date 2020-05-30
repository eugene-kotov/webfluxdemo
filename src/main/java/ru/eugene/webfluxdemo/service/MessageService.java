package ru.eugene.webfluxdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.eugene.webfluxdemo.domain.Message;
import ru.eugene.webfluxdemo.repo.MessageRepo;

@Service
public class MessageService {
    private final MessageRepo messageRepo;

    @Autowired
    public MessageService(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    public Flux<Message> getAll() {
        return messageRepo.findAll();
    }

    public Mono<Message> addOne(Message message) {
        return messageRepo.save(message);
    }
}

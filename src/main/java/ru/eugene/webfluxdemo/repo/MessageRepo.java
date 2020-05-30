package ru.eugene.webfluxdemo.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ru.eugene.webfluxdemo.domain.Message;

public interface MessageRepo extends ReactiveCrudRepository<Message, Long> {
}

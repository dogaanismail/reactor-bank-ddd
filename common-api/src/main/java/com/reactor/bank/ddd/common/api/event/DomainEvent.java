package com.reactor.bank.ddd.common.api.event;

import com.reactor.bank.ddd.common.api.Message;
import org.immutables.value.Value;

import java.util.UUID;

public interface DomainEvent extends Message {

    @Value.Default
    default String eventId() {
        return UUID.randomUUID().toString();
    }
}

package com.reactor.bank.ddd.common.api.command;

import com.reactor.bank.ddd.common.api.Message;
import org.immutables.value.Value;

import java.util.UUID;

public interface Command extends Message {
    @Value.Default
    default String commandId() {
        return UUID.randomUUID().toString();
    }
}

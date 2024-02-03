package com.reactor.bank.ddd.common.api.event;

@FunctionalInterface
public interface EventHandler<A> {

    <E extends DomainEvent> A apply(A aggregate, E event);
}

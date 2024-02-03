package com.reactor.bank.ddd.common.api.view;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.reactor.bank.ddd.common.api.event.DomainEvent;

public interface DomainView extends DomainEvent {

    @JsonIgnore
    String id();
}

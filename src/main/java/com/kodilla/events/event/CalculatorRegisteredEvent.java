package com.kodilla.events.event;

import org.springframework.context.ApplicationEvent;

public class CalculatorRegisteredEvent extends ApplicationEvent {
    private String operation;

    public CalculatorRegisteredEvent(Object source, String operation) {
        super(source);
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

}
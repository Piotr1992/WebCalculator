package com.kodilla.events.service;

import com.kodilla.events.event.CalculatorRegisteredEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CalculatorImageManager implements ApplicationListener<CalculatorRegisteredEvent> {

    @Override
    public void onApplicationEvent(CalculatorRegisteredEvent event) {
        System.out.println("Processing operation of " + event.getOperation());
    }

}
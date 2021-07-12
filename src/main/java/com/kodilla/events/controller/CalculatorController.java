package com.kodilla.events.controller;

import com.kodilla.events.domain.CalculatorDto;
import com.kodilla.events.event.CalculatorRegisteredEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/webCalculator")
public class CalculatorController implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    @PostMapping(path = "sum")
    public void sum(@RequestBody CalculatorDto calculatorDto) {
        System.out.println("Sum numbers(" + calculatorDto.getA() + ", " + calculatorDto.getB() + ") = " + (Double.parseDouble(calculatorDto.getA()) + Double.parseDouble(calculatorDto.getB())));
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        "Sum"
                )
        );
    }

    @PostMapping(path = "subtract")
    public void subtract(@RequestBody CalculatorDto calculatorDto) {
        System.out.println("Subtract numbers(" + calculatorDto.getA() + ", " + calculatorDto.getB() + ") = " + (Double.parseDouble(calculatorDto.getA()) - Double.parseDouble(calculatorDto.getB())));
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        "Subtract"
                )
        );
    }

    @PostMapping(path = "multiply")
    public void multiply(@RequestBody CalculatorDto calculatorDto) {
        System.out.println("Multiply numbers(" + calculatorDto.getA() + ", " + calculatorDto.getB() + ") = " + (Double.parseDouble(calculatorDto.getA()) * Double.parseDouble(calculatorDto.getB())));
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        "Multiply"
                )
        );
    }

    @PostMapping(path = "division")
    public void division(@RequestBody CalculatorDto calculatorDto) {
        System.out.println("Division numbers(" + calculatorDto.getA() + ", " + calculatorDto.getB() + ") = " + (Double.parseDouble(calculatorDto.getA()) / Double.parseDouble(calculatorDto.getB())));
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        "Division"
                )
        );
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

}
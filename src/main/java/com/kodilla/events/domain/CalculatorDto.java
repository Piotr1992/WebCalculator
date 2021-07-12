package com.kodilla.events.domain;

public class CalculatorDto {
    private String a;
    private String b;

    public CalculatorDto(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

}
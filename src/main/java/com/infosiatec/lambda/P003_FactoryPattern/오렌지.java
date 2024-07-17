package com.infosiatec.lambda.P003_FactoryPattern;

public class 오렌지 implements 과일 {

    private final String type;
    private final int weight;
    private final String color;

    public 오렌지(String type, int weight, String color) {
        this.type = type;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return type + "(" + weight + "g, " + color + ")";
    }
}

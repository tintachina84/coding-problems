package com.infosiatec.lambda.P004_StrategyPattern;

@FunctionalInterface
public interface RemoveStrategy {

    String execute(String s);
}

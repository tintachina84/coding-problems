package com.infosiatec.lambda.P001_WritingFunctionalInterface;

@FunctionalInterface
public interface Predicate<T> {

  boolean test(T t);
}

package com.infosiatec.lambda.P003_FactoryPattern;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {

    R apply(T t, U u, V v);
}

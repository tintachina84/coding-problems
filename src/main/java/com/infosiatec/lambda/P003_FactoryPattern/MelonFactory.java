package com.infosiatec.lambda.P003_FactoryPattern;

import java.util.Map;
import java.util.function.Supplier;

public final class MelonFactory {

    private MelonFactory() {
        throw new AssertionError("Cannot be instantiated");
    }

    private static final TriFunction<String, Integer, String, 오렌지> MELON = 오렌지::new;

    private static final Map<String, Supplier<과일>> MELONS
            = Map.of("천혜향", 천혜향::new, "레드향", 레드향::new, "한라봉", 한라봉::new);

    public static 과일 newInstance(String name, int weight, String color) {
        return MELON.apply(name, weight, color);
    }

    public static 과일 newInstance(Class<?> clazz) {

        Supplier<과일> supplier = MELONS.get(clazz.getSimpleName());

        if (supplier == null) {
            throw new IllegalArgumentException("Invalid clazz argument: " + clazz);
        }

        return supplier.get();
    }

    /*
    public static Fruit newInstance(Class<?> clazz) {

        switch (clazz.getSimpleName()) {

            case "Gac":
                return new Gac();
            case "Hemi":
                return new Hemi();
            case "Cantaloupe":
                return new Cantaloupe();
            default:
                throw new IllegalArgumentException("Invalid clazz argument: " + clazz);
        }
    }
     */
}

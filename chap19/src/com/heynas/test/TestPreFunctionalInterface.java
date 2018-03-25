package com.heynas.test;

import java.util.function.*;

/**
 * <p> Description:  TestPreFunctionalInterface </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestPreFunctionalInterface {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (n) -> {
            return -1 * n;
        };

        System.out.println(unaryOperator.apply(10));
        System.out.println(unaryOperator.apply(-10));

        BinaryOperator<Integer> binaryOperator = (a, b) -> {
            return a + b;
        };
        System.out.println(binaryOperator.apply(3, 5));

        Consumer<Integer> consumer = (n) -> {
            System.out.println(n + " is saved!");
        };
        consumer.accept(100);

        Supplier<Integer> supplier = () -> {
            return 100;
        };
        System.out.println(supplier.get());

        Function<String, Integer> function = (str) -> {
            return Integer.parseInt(str);
        };
        System.out.println(function.apply("100"));

        Predicate<Integer> predicate = (n) -> {
            if (n >=60) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println(predicate.test(80));

    }
}

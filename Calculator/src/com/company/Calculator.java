package com.company;

import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> sum = (x, y) -> x + y;
    BinaryOperator<Integer> subtract = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> (y != 0) ? x / y : -1;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}

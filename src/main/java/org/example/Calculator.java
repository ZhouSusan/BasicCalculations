package org.example;
import java.util.stream.DoubleStream;

public class Calculator {
       static double add(double... operands) {
           return DoubleStream.of(operands).sum();
        }

        static double multiply(double... operands) {
           return DoubleStream.of(operands).reduce(1, (a, b) -> a * b);
        }

        static double subtract(double a, double b) {
           return a - b;
        }

        static double divide(double a, double b) {
           return a / b;
        }
}
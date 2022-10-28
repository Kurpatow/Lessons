package ru.itmo.lessons.lesson16;

import javax.swing.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaLesson {
    private static void calculate(Operation operation, double x, double y) {
        System.out.println("Результат: " + operation.execute(x, y));
    }

    public static void main(String[] args) {
        // объявить интерфейс Operation
        // с абстрактным методом execute,
        // который принимает на вход два числа с плавающей точкой и
        // возвращает число с плавающей точкой


        // реализация метода execute функционального интерфейса +
        // создание экземпляра типа Operation

        // double execute(double a, double b);
        // если метод принимает на вход один аргумент, то круглые скобки можно опустить (на свое усмотрение)
        Operation plus = (first, second) -> first + second;
        Operation div = (a, b) -> {
            if (b == 0) return 0;
            return a / b;
        };
        Predicate<Integer> isPos = x -> x > 0;
        Predicate<Integer> isNeg = x -> x < 0;
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isPos.test(-90));
        System.out.println(isPos.and(isEven).test(100));
        System.out.println(isNeg.or(isPos).test(0));

        //
        //
        //
        //
        Function<Integer, Double> minus20 = x -> x * 0.8;
        Function<Integer, Integer> doubled = x -> x * 2;
        Function<Integer, String> str = x -> {
          if (x <= 0) throw new IllegalArgumentException("Число д.б положительным");
                return x + "р.";
        };
        System.out.println(doubled.apply(100));
        System.out.println(doubled.andThen(str).apply(12));
    }
}



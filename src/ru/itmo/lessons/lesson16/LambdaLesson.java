package ru.itmo.lessons.lesson16;


public class LambdaLesson {
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
    }
}



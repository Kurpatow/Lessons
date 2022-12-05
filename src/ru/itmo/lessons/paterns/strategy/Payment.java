package ru.itmo.lessons.paterns.strategy;

public interface Payment {
    void pay(double sum);
    void cancel();
    // ...

}

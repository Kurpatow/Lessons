package ru.itmo.lessons.paterns.strategy;

public class QIWI implements Payment {
    @Override
    public void pay(double sum) {
        System.out.println("QIWI оплата " + sum);
    }
    @Override
    public void cancel() {
    }

}

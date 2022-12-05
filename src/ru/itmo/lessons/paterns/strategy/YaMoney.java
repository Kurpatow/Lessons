package ru.itmo.lessons.paterns.strategy;

public class YaMoney implements Payment {
    @Override
    public void pay(double sum) {
        System.out.println("YaMoney оплата " + sum);
    }

    @Override
    public void cancel() {

    }
}

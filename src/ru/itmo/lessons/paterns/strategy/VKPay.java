package ru.itmo.lessons.paterns.strategy;

public class VKPay implements Payment {
    @Override
    public void pay(double sum) {
        System.out.println("VK Pay оплата " + sum);
    }

    @Override
    public void cancel() {

    }
}

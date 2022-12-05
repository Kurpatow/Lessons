package ru.itmo.lessons.multithreading.lesson25;

public class SomeThread extends Thread {
    @Override
    public void run() {
        System.out.println(this.getName());
        System.out.println(Thread.currentThread().getName());
    }
}

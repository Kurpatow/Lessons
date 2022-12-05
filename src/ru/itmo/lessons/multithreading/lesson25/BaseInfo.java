package ru.itmo.lessons.multithreading.lesson25;

public class BaseInfo {
    public static void main(String[] args) {
        SomeThread thread01 = new SomeThread();
        thread01.setName("thread01");

        thread01.start();
    }
}

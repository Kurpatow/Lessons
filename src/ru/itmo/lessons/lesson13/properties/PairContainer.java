package ru.itmo.lessons.lesson13.properties;

public class PairContainer<T, K> {
    private T kay;
    private K value;

    public PairContainer(T kay, K value) {
        this.kay = kay;
        this.value = value;
    }
    public T getKay() {
        return kay;
    }

    public K getValue() {
        return value;
    }

}

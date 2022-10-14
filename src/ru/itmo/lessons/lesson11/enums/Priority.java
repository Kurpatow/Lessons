package ru.itmo.lessons.lesson11.enums;

public enum Priority {
    HIGH(10), MIDDLE(5), LOW(1); //объекты экземпляры типа Priority

    // свойства
    private int code;
    Priority(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Priority{" +
                "code=" + code +
                '}';
    }
}

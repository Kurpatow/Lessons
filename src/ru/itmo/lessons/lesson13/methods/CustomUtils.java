package ru.itmo.lessons.lesson13.methods;

//generic типы
public class CustomUtils {
    // типизированные(generic) методы
    public static <T> boolean inArray(T[] array, T element) {
        // у Т параметров можно вызвать только методы Object
        // при компеляции тип Т преобразуется в Object
        for (T t : array) {
            if (element.equals(t)) return true;
        }
        return false;
    }
}

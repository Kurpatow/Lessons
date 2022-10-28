package ru.itmo.lessons.lesson17;

//Stream API - работа с потоками в java 8

import ru.itmo.lessons.lesson16.education.Course;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        Stream<Integer> integerStream03 = Stream.of(411, 7, 90, -1000, 0, 2, 71);
        System.out.println(integerStream03.allMatch(num -> num == 0));

        Stream<Integer> integerStream04 = Stream.of(411, 7, 90, -1000, 0, 2, 71);
        System.out.println(integerStream04.allMatch(num -> num >= 0));

        Stream<Integer> integerStream05 = Stream.of(411, 7, 90, -1000, 0, 2, 71);
        System.out.println(integerStream05.allMatch(num -> num <= 10_000));

        String[] colors = {"white", "black", "red", "yellow", "green"};
        String color = Arrays.stream(colors).findAny().get();
        color = Arrays.stream(colors).findAny().orElse("yellow");
        boolean isPresent = Arrays.stream(colors).findAny().isPresent();

        Arrays.stream(colors).skip(2).filter(colorElm -> colorElm.startsWith("y"))
                .forEach(System.out::println);

        ArrayList<Course> courses = new ArrayList<>(Course.getInstances(7));
        System.out.println(courses);
        //Минимальная стоимость
        Course minPrise = courses.stream().min((c1, c2) -> (int) (c1.getPrice() - c2.getPrice()))
                .orElse(Course.getInstance());
        System.out.println(minPrise);

        // Максимальная стоимость
        Course maxPrise = courses.stream().max((c1, c2) -> c1.getDuration() - c2.getDuration())
                .orElse(Course.getInstance());
        System.out.println(maxPrise);

        //sorted()
        //sorted(Comparator c)

        //Массив из потока(Stream)
        // Course[] со стоимостью 20_000
        Course[] coursesArray = courses.stream().filter(course -> course.getPrice() > 20_000)
                .toArray(Course[]::new); // передать ссылку на конструктор
        System.out.println(Arrays.toString(coursesArray));

        //List<Courses> продолжительность 3 и более месяца
        // увеличить стоимость каждого на 5_000
        List<Course> coursesList = courses.stream().filter(course -> course.getDuration() >= 3)
                .peek(course -> course.setPrice(course.getPrice() + 5_000))
                // .map(course -> new Course(...course.getPrise() + 5_000))
                .collect(Collectors.toList()); // .toList() список
                // .collect(Collectors.toSet()); // .toSet() множество
               // .collect(Collectors.toCollection(ArrayList :: new)); конкретная коллекция (реализация)

        // на основе массива String нужно создать Map, где ключи - это элементы массива, а значения - это размер строки
        colors = new String[] {"white", "black", "red", "yellow", "green"};
        Map<String, Integer> map01 = Arrays.stream(colors).collect(Collectors.toMap(
           // обычно описываются 3 аргумента:
                elem -> elem, // 1)Ключи keyMapper
                elem -> elem.length(), // 2)Значения valueMapper
                (elemValue1, elemValue2) -> elemValue1  // 3)Как сформировать значение, если ключи одинаковые
                       // BinaryOperator<U> mergeFunction R apply(T t, U u);
        ));
        System.out.println(map01);
    }
}

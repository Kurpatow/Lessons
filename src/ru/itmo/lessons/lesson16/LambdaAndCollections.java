package ru.itmo.lessons.lesson16;

import ru.itmo.lessons.lesson16.education.Course;
import ru.itmo.lessons.lesson16.education.University;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaAndCollections {
    public static void main(String[] args) {
        University university = new University();
        university.addCourses(Course.getInstances(15));

        //перебор коллекции - метод foreach
        // Consumer<T> - void accept (T , t);
        Consumer<Course> soutCourse = course -> System.out.println(course);
        university.getCourses().forEach(soutCourse);
        university.getCourses().forEach(course -> System.out.println(course.getName()));

        //увеличить стоимость круса на 10%
        university.getCourses().forEach(course -> course.setPrice(course.getPrice()));

        //вывести название курсов продолжительностью меньше 3 мес
        Consumer<Course> courses = course -> {
            if (course.getDuration() < 3) {
                System.out.println(course.getName());
            }
        };
        university.getCourses().forEach(courses);

        // Predicate<T> boolean test (T, t);
        // true, если курс дешевле 20_000
        // true, если продолжительность курса 3 месяца и меньше
        //true, если название курса jjd без учета  регистра

        Predicate<Course> byPrice = course -> course.getPrice() < 20_000;
        Predicate<Course> byDuration = course -> course.getDuration() <= 3;
        Predicate<Course> byName = course -> course.getName().equalsIgnoreCase("jjd");

        university.getFilteredCourses(byPrice).forEach(course -> System.out.println(course));


        // удаление методом removeIf
        //Predicate<T> boolean test(T, t);
        university.getCourses().removeIf(course -> course.getPrice() < 15_000);
        university.getCourses().forEach(course -> System.out.println(course));

        //сортировка (Comparator)
        // Comparator - int compare(T o1, T o2);
        Comparator<Course> compareByName = (course01, course02) -> course01.getName().compareTo(course02.getName());

    }
}

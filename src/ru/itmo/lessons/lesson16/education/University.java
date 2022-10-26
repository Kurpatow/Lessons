package ru.itmo.lessons.lesson16.education;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class University {
    private List<Course> courses = new ArrayList<>();

    public boolean addCourse(Course course) {
        return courses.add(Objects.requireNonNull(course));
    }
    public boolean addCourses(List<Course> courses) {
        return this.courses.addAll(Objects.requireNonNull(courses));
    }

    public List<Course> getCourses() {
        return courses;
    }

    // TODO:: принимает на вход predicate, возвращает новый список, состоящий из курсов,
    //  которые прошли проверку методом test
    public List<Course> getFilteredCourses(Predicate<Course> condition) { // условие для фильтрации

        return null;
    }
}

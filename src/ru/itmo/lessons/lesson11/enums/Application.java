package ru.itmo.lessons.lesson11.enums;

public class Application {
    public static void main(String[] args) {
        Article article01 = new Article("Путешествие по России");
        article01.setCountry(Country.RUSSIA);
        System.out.println(article01.getCountry());

        Article article02 = new Article("Путешествие по Японии");
        article02.setCountry(Country.JAPAN);
        System.out.println(article02.getCountry());

        Country[] countries = Country.values();
        // [RUSSIA, JAPAN, CHINA]
        // индекс элемента перечисления в массиве
        System.out.println(Country.JAPAN.ordinal()); //1

        for (Country country : countries) {
            System.out.println("country - " + country.name());
        }
        Country japan = Country.valueOf("JAPAN");
        System.out.println(Country.valueOf("JAPAN"));

        Priority low = Priority.LOW;
        System.out.println(low.getCode());

        low.setCode(2);
        System.out.println(Priority.LOW.getCode());

        Priority[] priorities = Priority.values();
        for (Priority priority : priorities){
            System.out.println(priority.getCode());
        }

        System.out.println();
    }
}

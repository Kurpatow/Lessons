package ru.itmo.lessons.lesson13.properties;

public class PropertiesApp {
    public static void main(String[] args) {
        User user = new User(); // это ограничение, так делать не надо
        user.setLogin("qwerty");
        user.setId("2171");
        Object id = user.getId();
        System.out.println(user.getId());

        User<String> stringUser = new User<>();
        stringUser.setLogin("qwe");
        stringUser.setId("RTY");
        String stringId = stringUser.getId();
        System.out.println(stringId.startsWith("user"));

        User<Integer> integerUser = new User<>();
        integerUser.setLogin("qwe");
        integerUser.setId(123);
        int intId = integerUser.getId();
        System.out.println(intId < 0);

        PairContainer<String, Integer> container01 = new PairContainer<>("A", 1);
        System.out.println(container01.getKay());
        System.out.println(container01.getValue());
    }
}

package ru.itmo.lessons.lesson15;

import java.util.*;

public class MapLesson {
    public static void main(String[] args) {
        // HashMap
        //String - тип данных ключа
        //Integer - тип данных значения
        HashMap<String, Integer> hashMap = new HashMap<>();
        // Добавление элементов
        hashMap.put("Ключ", 34343);

        HashMap<Integer, String> hashMap1 = new HashMap<>();
        HashMap<Integer, String> hashMap2 = new HashMap<>();

        hashMap1.put(21, "Вильнюс");
        hashMap1.put(16, "Рускеала");
        hashMap1.put(80, "Елабуга");

        hashMap2.put(91, "Самара");
        hashMap2.put(92, "Москва");


        hashMap1.putAll(hashMap2);
        System.out.println(hashMap1);

        //удаление
        hashMap1.remove(21);
        hashMap1.remove(80, "Рускеала");

        //замена
        hashMap1.replace(21, "Тюмень");
        hashMap1.replace(16, "hghg", "герп");

        //получение




        User user1 = new User("a", "a1", Role.ADMIN, 18);
        User user2 = new User("b", "b1", Role.USER, 22);
        User user3 = new User("c", "c1", Role.USER, 22);
        User user4 = new User("d", "d1", Role.USER, 44);
        User user5 = new User("f", "f1", Role.ADMIN, 18);

        EnumMap<Role, ArrayList<User>> enumMap02 = new EnumMap<Role, ArrayList<User>>(Role.class);
        ArrayList<User> users = new ArrayList<>(Arrays.asList(user2, user3, user4));
        ArrayList<User> admins = new ArrayList<>();
        admins.add(user1);
        admins.add(user5);

        enumMap02.put(Role.ADMIN, admins);
        enumMap02.put(Role.USER, users);

        User user6 = new User("z", "z1", Role.USER, 38);
        //добавить пользователя в правильный список мапы
        Role role = user6.getRole();
        ArrayList<User> list = enumMap02.get(role);
        list.add(user6);


        HashMap<String, User> userHashMap = new HashMap<>();
        userHashMap.put(user1.getLogin(), user1);
        userHashMap.put(user2.getLogin(), user2);
        userHashMap.put(user3.getLogin(), user3);
        userHashMap.put(user4.getLogin(), user4);
        userHashMap.put(user5.getLogin(), user5);
        //1. Логин пользователя старше 20 лет собрать в коллекцию.
        HashSet<String> login = new HashSet<>();
        for (Map.Entry<String, User> pair : userHashMap.entrySet()) {
            if (pair.getValue().getAge() > 20) login.add(pair.getKey());
        }
        //2. На основе существующей мапы создать новую,
        //где ключи - возраст
        //значения - списки
        HashMap<Integer, ArrayList<User>> ageMap = new HashMap<>();
        for (User user : userHashMap.values()) {
            if (!ageMap.containsKey(user.getAge())) {
                ArrayList<User> User = new ArrayList<>();
                User.add(user);
                ageMap.put(user.getAge(), users);
            }else {
                ageMap.get(user.getAge()).add(user);
            }
        }
        System.out.println(ageMap);
    }
}

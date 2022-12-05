package ru.itmo.lessons.paterns.bilder;

import java.util.Locale;

public class NutritionFacts {
    // обязательные свойства
    private int servings;
    // необязательные свойства
    private int calories;
    private int fat;

    // запрет создания объектов
    //т.к за создание объектов отвечает только Builder

    private NutritionFacts(Builder builder) {

    }
    public static class  Builder {
        // обязательные свойства
        private final int servings;
        // необязательные свойства
        private int calories = 1;
        private int fat = 1;

        // значение обязательных свойств задаёт конструктор
        public Builder(int servings) {
            this.servings = servings;
        }
        //для остальных свойств создаются сеттеры
        //проверки входящих данных осуществляется в конструкторе и сеттере
        //класса - строителя
        public Builder calories(int calories){
            this.calories = calories;
            return this;
        }
        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

}

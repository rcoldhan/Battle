package com.company;

/**
 * Создать абстрактный класс расы своих воинов
 */

public abstract class AbstractRace {
    /**
     * должен содержать 2 переменные, значения переменным задают классы-наследники
     */
    String name; //имя
    String specialty; //специализация

    AbstractRace(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    /**
     * должен содержать 1 абстрактный метод Бег, 1 обычный метод Смерть
     */
    abstract void run();

    public void death() {
        System.out.println("Все погибли");
    }
}

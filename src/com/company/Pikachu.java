package com.company;

public class Pikachu extends Pokemon implements IElectric {
    Pikachu() {
        super("Пикачу", "Электрический покемон", 100, 40);
    }

    @Override
    void run() {
        System.out.println(this.name + " спрятался в покебол!");
    }

    @Override
    public void electricShock(Pokemon target) {
        System.out.println(this.specialty + " " + this.name + " выпускает электрический разряд");
        this.attack(target);
    }

    @Override
    public void shield(Pokemon target) {
        System.out.println(this.specialty + " " + this.name + " создает вокруг себя электрическое поле и отражает атаку!");
        this.defense(target);
    }
}
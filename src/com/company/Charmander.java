package com.company;

public class Charmander extends Pokemon implements IFlamy {
    Charmander() {
        super("Чармандер", "Огненный покемон", 130, 30);
    }

    @Override
    void run() {
        System.out.println(this.name + " укрылся за покемастером");
    }

    @Override
    public void flameThrower(Pokemon target) {
        System.out.println(this.specialty + " " + this.name + " выдыхает огонь изо рта");
        this.attack(target);
    }

    @Override
    public void sunPower(Pokemon target) {
        System.out.println(this.specialty + " " + this.name + " применяет Силу Солнца и отражает атаку!");
        this.defense(target);
    }
}
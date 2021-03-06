package com.company;

public abstract class Pokemon {
    String name;
    String specialty;
    int health;
    int damage;

    Pokemon(String name, String specialty, int health, int damage) {
        this.name = name;
        this.specialty = specialty;
        this.health = health;
        this.damage = damage;
    }

    abstract void run();

    public void death() {
        System.out.println(this.name + " погиб. Битва завершена..");
        System.exit(0);
    }

    public void attack(Pokemon target) {
        target.health -= this.damage;
        if (target.health <= 0) {
            target.health = 0;
            target.death();
        }
    }

    public void defense(Pokemon target) {
        this.health += target.damage;
    }
}
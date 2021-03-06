package com.company;

public class Battle {


    public void start() {
        Pikachu pikachu = new Pikachu();
        Charmander charmander = new Charmander();

        while (pikachu.health > 0 || charmander.health > 0) {
            pikachu.electricShock(charmander);
            charmander.run();
            charmander.flameThrower(pikachu);
            pikachu.shield(charmander);
            pikachu.electricShock(charmander);
            charmander.sunPower(pikachu);
            charmander.flameThrower(pikachu);
        }
    }
}
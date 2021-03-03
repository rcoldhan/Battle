package com.company;

/**
 * В классе Battle создать метод start(), который будет запускать битву,
 * создаст экземпляры своих боевых юнитов и инсценирует битву с выводом в консоль.
 * Осуществление действий юнитами выражается через вывод в консоль,
 * т.е. в телах соответствующих методов (атака, защита, смерть, движение)
 * необходимо логировать эти действия.
 * В консоль выводится минимум одно событие битвы.
 */

public class Battle {

    public void start() {
        ArcherWarrior archer = new ArcherWarrior("Хуючник", "Лучник");
        WitcherWarrior witcher = new WitcherWarrior("Хуюдун", "Колдун");
        archer.bowShot();
        witcher.run();
        witcher.magicWaves();
        archer.raiseTheShield();
        archer.bowShot();
        witcher.invisibility();
        witcher.magicWaves();
        archer.death();
    }
}


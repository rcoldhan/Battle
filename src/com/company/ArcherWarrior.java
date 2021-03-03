package com.company;

public class ArcherWarrior extends AbstractRace implements ArcherInterface {
    //ArcherWarrior archer = new ArcherWarrior("Хуючник", "Лучник");
    ArcherWarrior(String name, String speciality) {
        super(name, speciality);
    }

    @Override
    public void run() {
        System.out.println(archer.name + "убегает как трусливая девчонка! ХА-ХА");
    }
    @Override
    public void bowShot() {
        System.out.println(archer.specialty + archer.name + "выпускает ядовитую стрелу!");
    }
    @Override
    public void raiseTheShield() {
        System.out.println(archer.specialty + archer.name + "поднимает щит и отражает магические волны");
    }
}

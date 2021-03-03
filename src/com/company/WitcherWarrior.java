package com.company;

public class WitcherWarrior extends AbstractRace implements WitcherInterface {
    //WitcherWarrior witcher = new WitcherWarrior("Хуюдун", "Колдун");
    WitcherWarrior(String name, String speciality) {
        super(name, speciality);
    }

    @Override
    public void run() {
        System.out.println(witcher.name + "укрылся за жопой твоей мамки");
    }
    @Override
    public void magicWaves() {
        System.out.println(witcher.specialty + witcher.name + "пукает магическими волнами..");
    }
    @Override
    public void invisibility() {
        System.out.println(witcher.specialty + witcher.name + "исчезает! Атака отражена");
    }
}

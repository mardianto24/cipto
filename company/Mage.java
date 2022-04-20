package com.company;

public class Mage extends Hero_ML {
    @Override
    void data() {
        nama="Kagura";
        hp=2000;
        damage_attack=2250;
        defence=1300;

        System.out.println("\nnama:" + nama);
        System.out.println("hp:" + hp);
        System.out.println("damage_attack:"+damage_attack);
        System.out.println("defence:"+defence);
    }
}
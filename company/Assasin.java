package com.company;

public class Assasin extends Hero_ML {
    @Override
    void data() {
        nama="Lancelot";
        hp=3200;
        damage_attack=2000;
        defence=2200;

        System.out.println("\nnama:" + nama);
        System.out.println("hp:" + hp);
        System.out.println("damage_attack:"+damage_attack);
        System.out.println("defence:"+defence);
    }
}

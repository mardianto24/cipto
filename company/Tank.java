package com.company;

public class Tank extends Hero_ML {
    @Override
    void data() {
        nama="Gatotkaca";
        hp=5000;
        damage_attack=800;
        defence=4300;

        System.out.println("\nnama:" + nama);
        System.out.println("hp:" + hp);
        System.out.println("damage_attack:"+damage_attack);
        System.out.println("defence:"+defence);
    }
}

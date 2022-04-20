package com.company;

public class Fighter extends Hero_ML {
    @Override
    void data() {
        nama="Sun";
        hp=4300;
        damage_attack=1100;
        defence=3300;

        System.out.println("\nnama:" + nama);
        System.out.println("hp:" + hp);
        System.out.println("damage_attack:"+damage_attack);
        System.out.println("defence:"+defence);
    }
}

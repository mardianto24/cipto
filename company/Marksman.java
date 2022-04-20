package com.company;

public class Marksman extends Hero_ML {
    @Override
    void data(){
        nama="Miya";
        hp=3000;
        damage_attack=1250;
        defence=2000;

        System.out.println("\nnama:"+nama);
        System.out.println("hp:"+hp);
        System.out.println("damage_attack:"+damage_attack);
        System.out.println("defence:"+defence);
    }
}

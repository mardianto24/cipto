package com.company;

public class Thamus extends Fighter {
    void data() {
        lane = "exp";
        gold_detik = 750;
        damage_detik = 1800;

        System.out.println("\nlane: " + lane);
        System.out.println("gold_detik:" + gold_detik);
        System.out.println("damage_detik: " + damage_detik);
    }
}
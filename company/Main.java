package com.company;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Marksman m = new Marksman();
      Assasin a = new Assasin();
      Tank t = new Tank();
      Fighter f = new Fighter();
      Mage g = new Mage();

      int pilihan;
      System.out.println("DATA HERO");
      System.out.println("1. Marksman");
      System.out.println("2. Assasin");
      System.out.println("3. Tank");
      System.out.println("4. Fighter");
      System.out.println("5. Mage");
      System.out.print("Masukkan Pilihan:");
      pilihan = input.nextInt();
      if (pilihan == 1) {
         m.data();
      }else if(pilihan == 2) {
         a.data();
      }else if(pilihan == 3) {
         t.data();
      }else if(pilihan == 4) {
         f.data();
      }else if(pilihan == 5) {
         g.data();
      }else{
         System.out.println("Inputan anda salah");
      }
   }
}
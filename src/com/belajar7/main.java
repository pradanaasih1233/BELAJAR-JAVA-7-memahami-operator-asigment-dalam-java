// MEMAHAMI OPERATOR ASIGMENT
// operator ini digunaka untuk mengoperasikan nilai dengan dirinya sendiri

package com.belajar7;

import jdk.swing.interop.SwingInterOpUtils;

public class main {
    public static void main(String[] args){

        //deklarasi
        int a = 10;

        System.out.println("=================");
        System.out.println("OPERATOR ASIGMENT");
        System.out.println("=================");

        //1. operator asigment penjumlahan
        System.out.println("\n1. PENJUMLAHAN");
        //Contoh:
        a = 10;
        System.out.println("a = " + a);
        a += a; //<--- ini sama dengan a = a + a
        System.out.println("hasil = " + a );

        //2. operator asigment pengurangan
        System.out.println("\n2. PENGURANGAN");
        //Contoh:
        a = 10;
        System.out.println("a = " + a);
        a -= a; //<--- ini sama dengan a = a - a
        System.out.println("hasil = " + a );

        //3. operator asigment perkalian
        System.out.println("\n3. PERKALIAN");
        //Contoh:
        a = 10;
        System.out.println("a = " + a);
        a *= a; //<--- ini sama dengan a = a * a
        System.out.println("hasil = " + a );

        //4. operator asigment pembagian
        System.out.println("\n4. PEMBAGIAN");
        //Contoh:
        a = 10;
        System.out.println("a = " + a);
        a /= a; //<--- ini sama dengan a = a / a
        System.out.println("hasil = " + a );

        //5. operator asigment moduluds
        System.out.println("\n5. MODULUS");
        //Contoh:
        a = 10;
        System.out.println("a = " + a);
        a %= a; //<--- ini sama dengan a = a % a
        System.out.println("hasil = " + a );

    }
}

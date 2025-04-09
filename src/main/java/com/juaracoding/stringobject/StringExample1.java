package com.juaracoding.stringobject;

import java.util.Scanner;

public class StringExample1 {

    public static void main(String[] args) {
        String strContoh = "Yngwie";
        System.out.println("Banyak Karakter : "+strContoh.length());
        char charX = 'Y';
        System.out.println((int)'Y');
        System.out.println("Value : "+strContoh);

        boolean isStop = true;
        while (isStop) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukan Bilangan Bulat : ");
            int int1 = sc.nextInt();
            System.out.print("Masukan Bilangan Desimal : ");
            double do1 = sc.nextDouble();
            System.out.println("Bilangan Bulat = " + int1);
            System.out.println("Bilangan Desimal = " + do1);
            System.out.println("Ingin lanjut? Ketik 1");
            int intx = sc.nextInt();
            if (intx != 1){
                isStop = false;
            }
        }

    }
}

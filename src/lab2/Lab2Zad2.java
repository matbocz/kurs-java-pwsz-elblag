package lab2; //deklaracja pakietu

import java.util.Random; //import klasy

public class Lab2Zad2 { //definicja klasy publicznej
    public static void main(String[] args) { //definicja metody

        //deklaracja zmiennych
        int N = 10;
        int i, a;

        //utworzenie obiektu typu random
        Random r = new Random();

        //wydrukowanie liczb losowych typu int
        System.out.println("5 losowych liczb typu int:");
        for (i = 0; i < 5; i++)
            System.out.println(r.nextInt());
        System.out.printf("\n");

        //wydrukowanie liczb losowych typu float
        System.out.println("10 losowych liczb typu float:");
        for (i = 0; i < 10; i++)
            System.out.println(r.nextFloat());
        System.out.printf("\n");

        //wydrukowanie liczb losowych typu int z zakresu [0,N)
        System.out.println("12 losowych liczb typu int z zakresu [0,N):");
        for (i = 0; i < 12; i++)
            System.out.println(r.nextInt(N));
        System.out.printf("\n");

        //wydrukowanie liczb losowych typu int z zakresu [-10,20]
        System.out.println("15 losowych liczb typu int z zakresu [-10,20]:");
        for (i = 0; i < 15; i++) {
            a = r.nextInt(31) - 10;
            System.out.println(a);
        }
    }
}
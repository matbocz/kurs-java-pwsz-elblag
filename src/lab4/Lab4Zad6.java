package lab4;

import java.math.BigInteger;

public class Lab4Zad6 {
    public static void main(String[] args) {
        //utworzenie obiektu typu BigInteger za pomocą konstruktora
        BigInteger a = new BigInteger("32416190071");
        //utworzenie zmiennej typu boolean
        boolean p;

        //wydrukowanie liczby typu BigInteger
        System.out.println("Liczba: " + a);

        //sprawdzenie czy liczba typu BigInteger jest pierwsza
        p = a.isProbablePrime(20);

        //wydrukowanie informacji czy liczba typu BigInteger jest pierwsza
        System.out.println("Czy liczba jest pierwsza? " + p);
    }
}
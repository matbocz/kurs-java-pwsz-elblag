package lab4;

import java.math.BigInteger;

public class Lab4Zad5 {
    public static void main(String[] args) {
        //utworzenie obiektu typu BigInteger za pomocą konstruktora
        BigInteger a = new BigInteger("2345768907654222");
        //utworzenie obiektu typu BigInteger za pomocą metody valueOf
        BigInteger b = BigInteger.valueOf(3000);
        //utworzenie obiektu typu BigInteger za pomocą konstruktora
        BigInteger c = new BigInteger("1");

        //wydrukowanie liczb typu BigInteger
        System.out.println("Liczba a: " + a);
        System.out.println("Liczba b: " + b);
        System.out.println();

        //wykonanie obliczeń na liczbach typu BigInteger
        c = c.multiply(a.subtract(b).add(BigInteger.valueOf(100)));

        //wydrukowanie wyników obliczeń na liczbach typu BigInteger
        System.out.println("Działanie: c = (a - b + 100) * c");
        System.out.println("Liczba c: " + c);
    }
}